;; This Source Code Form is subject to the terms of the Mozilla Public
;; License, v. 2.0. If a copy of the MPL was not distributed with this
;; file, You can obtain one at http://mozilla.org/MPL/2.0/.
;;
;; This Source Code Form is "Incompatible With Secondary Licenses", as
;; defined by the Mozilla Public License, v. 2.0.
;;
;; Copyright (c) 2020-2021 UXBOX Labs SL

(ns app.tasks.delete-profile
  "Task for permanent deletion of profiles."
  (:require
   [app.common.spec :as us]
   [app.db :as db]
   [app.db.sql :as sql]
   [clojure.spec.alpha :as s]
   [clojure.tools.logging :as log]
   [integrant.core :as ig]))

(declare delete-profile-data)

;; --- INIT

(defmethod ig/pre-init-spec ::handler [_]
  (s/keys :req-un [::db/pool]))

;; This task is responsible to permanently delete a profile with all
;; the dependent data. As step (1) we delete all owned teams of the
;; profile (that will cause to delete all underlying projects, files,
;; file_media and mark to be deleted storage_object's used by team,
;; profile and files previously deleted. Then, finally as step (2) we
;; proceed to delete the profile row.
;;
;; The storage_objects marked as deleted will be deleted by the
;; corresponding garbage collector task.

(s/def ::profile-id ::us/uuid)
(s/def ::props (s/keys :req-un [::profile-id]))

(defmethod ig/init-key ::handler
  [_ {:keys [pool] :as cfg}]
  (fn [{:keys [props] :as task}]
    (us/verify ::props props)
    (db/with-atomic [conn pool]
      (let [id      (:profile-id props)
            profile (db/exec-one! conn (sql/select :profile {:id id} {:for-update true}))]
        (if (or (:is-demo profile)
                (:deleted-at profile))
          (delete-profile-data conn id)
          (log/warnf "profile '%s' does not match constraints for deletion" id))))))

;; --- IMPL

(def ^:private sql:remove-owned-teams
  "delete from team
    where id in (
      select tpr.team_id
        from team_profile_rel as tpr
       where tpr.is_owner is true
         and tpr.profile_id = ?
    )")

(defn- delete-teams
  [conn profile-id]
  (db/exec-one! conn [sql:remove-owned-teams profile-id]))

(defn delete-profile
  [conn profile-id]
  (db/delete! conn :profile {:id profile-id}))

(defn- delete-profile-data
  [conn profile-id]
  (log/debugf "proceding to delete all data related to profile '%s'" profile-id)
  (delete-teams conn profile-id)
  (delete-profile conn profile-id)
  true)

