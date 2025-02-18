;; This Source Code Form is subject to the terms of the Mozilla Public
;; License, v. 2.0. If a copy of the MPL was not distributed with this
;; file, You can obtain one at http://mozilla.org/MPL/2.0/.
;;
;; Copyright (c) KALEIDOS INC

(ns app.main.ui.icons
  (:refer-clojure :exclude [import mask])
  (:require-macros [app.main.ui.icons :refer [icon-xref]])
  (:require [rumext.v2 :as mf]))

;; Keep the list of icons sorted

(def action (icon-xref :action))
(def actions (icon-xref :actions))
(def align-bottom (icon-xref :align-bottom))
(def align-content-column-around (icon-xref :align-content-column-around))
(def align-content-column-evenly (icon-xref :align-content-column-evenly))
(def align-content-column-between (icon-xref :align-content-column-between))
(def align-content-column-center (icon-xref :align-content-column-center))
(def align-content-column-end (icon-xref :align-content-column-end))
(def align-content-column-start (icon-xref :align-content-column-start))
(def align-content-row-around (icon-xref :align-content-row-around))
(def align-content-row-evenly (icon-xref :align-content-row-evenly))
(def align-content-row-between (icon-xref :align-content-row-between))
(def align-content-row-center (icon-xref :align-content-row-center))
(def align-content-row-end (icon-xref :align-content-row-end))
(def align-content-row-start (icon-xref :align-content-row-start))
(def align-items-column-baseline (icon-xref :align-items-column-baseline))
(def align-items-column-center (icon-xref :align-items-column-center))
(def align-items-column-end (icon-xref :align-items-column-end))
(def align-items-column-start (icon-xref :align-items-column-start))
(def align-items-column-strech (icon-xref :align-items-column-strech))
(def align-items-row-baseline (icon-xref :align-items-row-baseline))
(def align-items-row-center (icon-xref :align-items-row-center))
(def align-items-row-end (icon-xref :align-items-row-end))
(def align-items-row-start (icon-xref :align-items-row-start))
(def align-items-row-strech (icon-xref :align-items-row-strech))
(def align-self-column-baseline (icon-xref :align-self-column-baseline))
(def align-self-column-center (icon-xref :align-self-column-center))
(def align-self-column-top (icon-xref :align-self-column-top))
(def align-self-column-bottom (icon-xref :align-self-column-bottom))
(def align-self-column-strech (icon-xref :align-self-column-strech))
(def align-self-row-baseline (icon-xref :align-self-row-baseline))
(def align-self-row-center (icon-xref :align-self-row-center))
(def align-self-row-left (icon-xref :align-self-row-left))
(def align-self-row-right (icon-xref :align-self-row-right))
(def align-self-row-strech (icon-xref :align-self-row-strech))
(def align-middle (icon-xref :align-middle))
(def align-top (icon-xref :align-top))
(def alignment (icon-xref :alignment))
(def animate-down (icon-xref :animate-down))
(def animate-left (icon-xref :animate-left))
(def animate-right (icon-xref :animate-right))
(def animate-up (icon-xref :animate-up))
(def arrow-down (icon-xref :arrow-down))
(def arrow-end (icon-xref :arrow-end))
(def arrow-slide (icon-xref :arrow-slide))
(def arrow-up (icon-xref :arrow-up))
(def artboard (icon-xref :artboard))
(def at (icon-xref :at))
(def auto-direction (icon-xref :auto-direction))
(def auto-fill (icon-xref :auto-fill))
(def auto-fix (icon-xref :auto-fix))
(def auto-fix-layout (icon-xref :auto-fix-layout))
(def auto-gap (icon-xref :auto-gap))
(def auto-height (icon-xref :auto-height))
(def auto-hug (icon-xref :auto-hug))
(def auto-margin-side (icon-xref :auto-margin-side))
(def auto-margin-both-sides (icon-xref :auto-margin-both-sides))
(def auto-margin (icon-xref :auto-margin))
(def auto-padding (icon-xref :auto-padding))
(def auto-padding-side (icon-xref :auto-padding-side))
(def auto-padding-both-sides (icon-xref :auto-padding-both-sides))
(def auto-width (icon-xref :auto-width))
(def auto-wrap (icon-xref :auto-wrap))
(def bool-difference (icon-xref :boolean-difference))
(def bool-exclude (icon-xref :boolean-exclude))
(def bool-flatten (icon-xref :boolean-flatten))
(def bool-intersection (icon-xref :boolean-intersection))
(def bool-union (icon-xref :boolean-union))
(def box (icon-xref :box))
(def bug (icon-xref :bug))
(def chain (icon-xref :chain))
(def chat (icon-xref :chat))
(def checkbox-checked (icon-xref :checkbox-checked))
(def checkbox-unchecked (icon-xref :checkbox-unchecked))
(def checkbox-intermediate (icon-xref :checkbox-intermediate))
(def circle (icon-xref :circle))
(def close (icon-xref :close))
(def code (icon-xref :code))
(def component (icon-xref :component))
(def component-copy (icon-xref :component-copy))
(def copy (icon-xref :copy))
(def curve (icon-xref :curve))
(def cross (icon-xref :cross))
(def download (icon-xref :download))
(def easing-linear (icon-xref :easing-linear))
(def easing-ease (icon-xref :easing-ease))
(def easing-ease-in (icon-xref :easing-ease-in))
(def easing-ease-out (icon-xref :easing-ease-out))
(def easing-ease-in-out (icon-xref :easing-ease-in-out))
(def exclude (icon-xref :exclude))
(def exit (icon-xref :exit))
(def export (icon-xref :export))
(def eye (icon-xref :eye))
(def eye-closed (icon-xref :eye-closed))
(def file-html (icon-xref :file-html))
(def file-svg (icon-xref :file-svg))
(def fill (icon-xref :fill))
(def folder (icon-xref :folder))
(def folder-zip (icon-xref :folder-zip))
(def full-screen (icon-xref :full-screen))
(def full-screen-off (icon-xref :full-screen-off))
(def grid (icon-xref :grid))
(def grid-justify-content-column-around (icon-xref :grid-justify-content-column-around))
(def grid-justify-content-column-between (icon-xref :grid-justify-content-column-between))
(def grid-justify-content-column-center (icon-xref :grid-justify-content-column-center))
(def grid-justify-content-column-end (icon-xref :grid-justify-content-column-end))
(def grid-justify-content-column-start (icon-xref :grid-justify-content-column-start))
(def grid-justify-content-row-around (icon-xref :grid-justify-content-row-around))
(def grid-justify-content-row-between (icon-xref :grid-justify-content-row-between))
(def grid-justify-content-row-center (icon-xref :grid-justify-content-row-center))
(def grid-justify-content-row-end (icon-xref :grid-justify-content-row-end))
(def grid-justify-content-row-start (icon-xref :grid-justify-content-row-start))
(def grid-layout-mode (icon-xref :grid-layout-mode))
(def grid-snap (icon-xref :grid-snap))
(def go-next (icon-xref :go-next))
(def go-prev (icon-xref :go-prev))
(def help (icon-xref :help))
(def icon-empty (icon-xref :icon-empty))
(def icon-filter (icon-xref :filter))
(def icon-list (icon-xref :icon-list))
(def icon-lock (icon-xref :icon-lock))
(def icon-set (icon-xref :icon-set))
(def icon-verify (icon-xref :icon-verify))
(def image (icon-xref :image))
(def import (icon-xref :import))
(def infocard (icon-xref :infocard))
(def interaction (icon-xref :interaction))
(def justify-content-column-around (icon-xref  :justify-content-column-around))
(def justify-content-column-evenly (icon-xref  :justify-content-column-evenly))
(def justify-content-column-between (icon-xref  :justify-content-column-between))
(def justify-content-column-center (icon-xref :justify-content-column-center))
(def justify-content-column-end (icon-xref  :justify-content-column-end))
(def justify-content-column-start (icon-xref  :justify-content-column-start))
(def justify-content-row-around (icon-xref :justify-content-row-around))
(def justify-content-row-evenly (icon-xref :justify-content-row-evenly))
(def justify-content-row-between (icon-xref :justify-content-row-between))
(def justify-content-row-center (icon-xref :justify-content-row-center))
(def justify-content-row-end (icon-xref :justify-content-row-end))
(def justify-content-row-start (icon-xref :justify-content-row-start))
(def icon-key (icon-xref :icon-key))
(def layers (icon-xref :layers))
(def layout-columns (icon-xref :layout-columns))
(def layout-rows (icon-xref :layout-rows))
(def letter-spacing (icon-xref :letter-spacing))
(def libraries (icon-xref :libraries))
(def library (icon-xref :library))
(def line (icon-xref :line))
(def line-height (icon-xref :line-height))
(def listing-enum (icon-xref :listing-enum))
(def listing-thumbs (icon-xref :listing-thumbs))
(def loader (icon-xref :loader))
(def lock (icon-xref :lock))
(def logo (icon-xref :penpot-logo))
(def logo-icon (icon-xref :penpot-logo-icon))
(def logout (icon-xref :logout))
(def lowercase (icon-xref :lowercase))
(def mail (icon-xref :mail))
(def mask (icon-xref :mask))
(def minus (icon-xref :minus))
(def move (icon-xref :move))
(def msg-error (icon-xref :msg-error))
(def msg-info (icon-xref :msg-info))
(def msg-success (icon-xref :msg-success))
(def msg-warning (icon-xref :msg-warning))
(def navigate (icon-xref :navigate))
(def nodes-add (icon-xref :nodes-add))
(def nodes-corner (icon-xref :nodes-corner))
(def nodes-curve (icon-xref :nodes-curve))
(def nodes-join (icon-xref :nodes-join))
(def nodes-merge (icon-xref :nodes-merge))
(def nodes-remove (icon-xref :nodes-remove))
(def nodes-separate (icon-xref :nodes-separate))
(def nodes-snap (icon-xref :nodes-snap))
(def organize (icon-xref :organize))
(def palette (icon-xref :palette))
(def pen (icon-xref :pen))
(def pencil (icon-xref :pencil))
(def picker (icon-xref :picker))
(def picker-harmony (icon-xref :picker-harmony))
(def picker-hsv (icon-xref :picker-hsv))
(def picker-ramp (icon-xref :picker-ramp))
(def pin (icon-xref :pin))
(def pin-fill (icon-xref :pin-fill))
(def play (icon-xref :play))
(def plus (icon-xref :plus))
(def pointer-inner (icon-xref :pointer-inner))
(def position-absolute (icon-xref :position-absolute))
(def position-bottom-center (icon-xref :position-bottom-center))
(def position-bottom-left (icon-xref :position-bottom-left))
(def position-bottom-right (icon-xref :position-bottom-right))
(def position-center (icon-xref :position-center))
(def position-top-center (icon-xref :position-top-center))
(def position-top-left (icon-xref :position-top-left))
(def position-top-right (icon-xref :position-top-right))
(def radius (icon-xref :radius))
(def radius-1 (icon-xref :radius-1))
(def radius-4 (icon-xref :radius-4))
(def recent (icon-xref :recent))
(def redo (icon-xref :redo))
(def reset (icon-xref :reset))
(def rotate (icon-xref :rotate))
(def ruler (icon-xref :ruler))
(def ruler-tool (icon-xref :ruler-tool))
(def search (icon-xref :search))
(def set-thumbnail (icon-xref :set-thumbnail))
(def shape-halign-center (icon-xref :shape-halign-center))
(def shape-halign-left (icon-xref :shape-halign-left))
(def shape-halign-right (icon-xref :shape-halign-right))
(def shape-hdistribute (icon-xref :shape-hdistribute))
(def shape-valign-bottom (icon-xref :shape-valign-bottom))
(def shape-valign-center (icon-xref :shape-valign-center))
(def shape-valign-top (icon-xref :shape-valign-top))
(def shape-vdistribute (icon-xref :shape-vdistribute))
(def shortcut (icon-xref :shortcut))
(def size-horiz (icon-xref :size-horiz))
(def size-vert (icon-xref :size-vert))
(def sort-ascending (icon-xref :sort-ascending))
(def sort-descending (icon-xref :sort-descending))
(def space-around (icon-xref :space-around))
(def space-between (icon-xref :space-between))
(def strikethrough (icon-xref :strikethrough))
(def stroke (icon-xref :stroke))
(def switch (icon-xref :switch))
(def text (icon-xref :text))
(def text-align-center (icon-xref :text-align-center))
(def text-align-justify (icon-xref :text-align-justify))
(def text-align-left (icon-xref :text-align-left))
(def text-align-right (icon-xref :text-align-right))
(def text-direction-ltr (icon-xref :text-direction-ltr))
(def text-direction-rtl (icon-xref :text-direction-rtl))
(def tick (icon-xref :tick))
(def titlecase (icon-xref :titlecase))
(def toggle (icon-xref :toggle))
(def trash (icon-xref :trash))
(def tree (icon-xref :tree))
(def unchain (icon-xref :unchain))
(def underline (icon-xref :underline))
(def undo (icon-xref :undo))
(def ungroup (icon-xref :ungroup))
(def unlock (icon-xref :unlock))
(def uppercase (icon-xref :uppercase))
(def user (icon-xref :user))

(def brand-openid (icon-xref :brand-openid))
(def brand-github (icon-xref :brand-github))
(def brand-gitlab (icon-xref :brand-gitlab))
(def brand-google (icon-xref :brand-google))

(def add-refactor (icon-xref :add-refactor))
(def arrow-refactor (icon-xref :arrow-refactor))
(def asc-sort-refactor (icon-xref :asc-sort-refactor))
(def absolute-refactor (icon-xref :absolute-refactor))
(def align-bottom-refactor (icon-xref :align-bottom-refactor))
(def align-content-center-refactor (icon-xref :align-content-center-refactor))
(def align-content-end-refactor (icon-xref :align-content-end-refactor))
(def align-content-space-around-refactor (icon-xref :align-content-space-around-refactor))
(def align-content-space-between-refactor (icon-xref :align-content-space-between-refactor))
(def align-content-space-evenly-refactor (icon-xref :align-content-space-evenly-refactor))
(def align-content-start-refactor (icon-xref :align-content-start-refactor))
(def align-horizontal-center-refactor (icon-xref :align-horizontal-center-refactor))
(def align-vertical-center-refactor (icon-xref :align-vertical-center-refactor))
(def align-items-center-refactor (icon-xref :align-items-center-refactor))
(def align-items-end-refactor (icon-xref :align-items-end-refactor))
(def align-items-start-refactor (icon-xref :align-items-start-refactor))
(def align-left-refactor (icon-xref :align-left-refactor))
(def align-right-refactor (icon-xref :align-right-refactor))
(def align-top-refactor (icon-xref :align-top-refactor))
(def board-refactor (icon-xref :board-refactor))
(def boards-thumbnail-refactor (icon-xref :boards-thumbnail-refactor))
(def boolean-difference-refactor (icon-xref :boolean-difference-refactor))
(def boolean-exclude-refactor (icon-xref :boolean-exclude-refactor))
(def boolean-flatten-refactor (icon-xref :boolean-flatten-refactor))
(def boolean-intersection-refactor (icon-xref :boolean-intersection-refactor))
(def boolean-union-refactor (icon-xref :boolean-union-refactor))
(def close-refactor (icon-xref :close-refactor))
(def close-small-refactor (icon-xref :close-small-refactor))
(def component-refactor (icon-xref :component-refactor))
(def comments-refactor (icon-xref :comments-refactor))
(def copy-refactor (icon-xref :copy-refactor))
(def column-refactor (icon-xref :column-refactor))
(def column-reverse-refactor (icon-xref :column-reverse-refactor))
(def constraint-horizontal-refactor (icon-xref :constraint-horizontal-refactor))
(def constraint-vertical-refactor (icon-xref :constraint-vertical-refactor))
(def corner-radius-refactor (icon-xref :corner-radius-refactor))
(def curve-refactor (icon-xref :curve-refactor))
(def distribute-vertical-sapcing-refactor (icon-xref :distribute-vertical-spacing-refactor))
(def distribute-horizontally-refactor (icon-xref :distribute-horizontally-refactor))
(def delete-refactor (icon-xref :delete-refactor))
(def delete-text-refactor (icon-xref :delete-text-refactor))
(def desc-sort-refactor (icon-xref :desc-sort-refactor))
(def detach-refactor (icon-xref :detach-refactor))
(def document-refactor (icon-xref :document-refactor))
(def drop-refactor (icon-xref :drop-refactor))
(def effects-refactor (icon-xref :effects-refactor))
(def elipse-refactor (icon-xref :elipse-refactor))
(def filter-refactor (icon-xref :filter-refactor))
(def flex-refactor (icon-xref :flex-refactor))
(def flex-horizontal-refactor (icon-xref :flex-horizontal-refactor))
(def flex-grid-refactor (icon-xref :flex-grid-refactor))
(def flex-vertical-refactor (icon-xref :flex-vertical-refactor))
(def flip-horizontal-refactor (icon-xref :flip-horizontal-refactor))
(def grid-column-refactor (icon-xref :grid-column-refactor))
(def grid-columns-refactor (icon-xref :grid-columns-refactor))
(def grid-gutter-refactor (icon-xref :grid-gutter-refactor))
(def grid-margin-refactor (icon-xref :grid-margin-refactor))
(def grid-row-refactor (icon-xref :grid-row-refactor))
(def grid-rows-refactor (icon-xref :grid-rows-refactor))
(def grid-square-refactor (icon-xref :grid-square-refactor))
(def grid-refactor (icon-xref :grid-refactor))
(def group-refactor (icon-xref :group-refactor))
(def graphics-refactor (icon-xref :graphics-refactor))
(def gutter-horizontal-refactor (icon-xref :gutter-horizontal-refactor))
(def gutter-vertical-refactor (icon-xref :gutter-vertical-refactor))
(def hide-refactor (icon-xref :hide-refactor))
(def history-refactor (icon-xref :history-refactor))
(def img-refactor (icon-xref :img-refactor))
(def icon-refactor (icon-xref :icon-refactor))
(def justify-content-center-refactor (icon-xref :justify-content-center-refactor))
(def justify-content-end-refactor (icon-xref :justify-content-end-refactor))
(def justify-content-start-refactor (icon-xref :justify-content-start-refactor))
(def justify-content-space-between-refactor (icon-xref :justify-content-space-between-refactor))
(def justify-content-space-around-refactor (icon-xref :justify-content-space-around-refactor))
(def justify-content-space-evenly-refactor (icon-xref :justify-content-space-evenly-refactor))
(def lock-refactor (icon-xref :lock-refactor))
(def library-refactor (icon-xref :library-refactor))
(def margin-bottom-refactor (icon-xref :margin-bottom-refactor))
(def margin-left-refactor (icon-xref :margin-left-refactor))
(def margin-left-right-refactor (icon-xref :margin-left-right-refactor))
(def margin-right-refactor (icon-xref :margin-right-refactor))
(def margin-top-refactor (icon-xref :margin-top-refactor))
(def margin-top-bottom-refactor (icon-xref :margin-top-bottom-refactor))
(def mask-refactor (icon-xref :mask-refactor))
(def masked-refactor (icon-xref :masked-refactor))
(def menu-refactor (icon-xref :menu-refactor))
(def move-refactor (icon-xref :move-refactor))
(def open-link-refactor (icon-xref :open-link-refactor))
(def open-refactor (icon-xref :open-refactor))
(def padding-bottom-refactor (icon-xref :padding-bottom-refactor))
(def padding-top-refactor (icon-xref :padding-top-refactor))
(def padding-top-bottom-refactor (icon-xref :padding-top-bottom-refactor))
(def padding-left-refactor (icon-xref :padding-left-refactor))
(def padding-left-right-refactor (icon-xref :padding-left-right-refactor))
(def padding-right-refactor (icon-xref :padding-right-refactor))
(def padding-extended-refactor (icon-xref :padding-extended-refactor))
(def path-refactor (icon-xref :path-refactor))
(def pentool-refactor (icon-xref :pentool-refactor))
(def play-refactor (icon-xref :play-refactor))
(def rectangle-refactor (icon-xref :rectangle-refactor))
(def remove-refactor (icon-xref :remove-refactor))
(def rotation-refactor (icon-xref :rotation-refactor))
(def row-reverse-refactor (icon-xref :row-reverse-refactor))
(def search-refactor (icon-xref :search-refactor))
(def size-horizontal-refactor (icon-xref :size-horizontal-refactor))
(def size-vertical-refactor (icon-xref :size-vertical-refactor))
(def shown-refactor (icon-xref :shown-refactor))
(def status-alert-refactor (icon-xref :status-alert-refactor))
(def status-update-refactor (icon-xref :status-update-refactor))
(def status-tick-refactor (icon-xref :status-tick-refactor))
(def status-wrong-refactor (icon-xref :status-wrong-refactor))
(def stroke-size-refactor (icon-xref :stroke-size-refactor))
(def svg-refactor (icon-xref :svg-refactor))
(def swatches-refactor (icon-xref :swatches-refactor))
(def text-align-center-refactor (icon-xref :text-align-center-refactor))
(def text-align-left-refactor (icon-xref :text-align-left-refactor))
(def text-align-right-refactor (icon-xref :text-align-right-refactor))
(def text-auto-height-refactor (icon-xref :text-auto-height-refactor))
(def text-auto-width-refactor (icon-xref :text-auto-width-refactor))
(def text-fixed-refactor (icon-xref :textfixed--refactor))
(def text-justify-refactor (icon-xref :text-justify-refactor))
(def text-letterspacing-refactor (icon-xref :text-letterspacing-refactor))
(def text-lineheight-refactor (icon-xref :text-lineheight-refactor))
(def text-lowercase-refactor (icon-xref :text-lowercase-refactor))
(def text-palette-refactor (icon-xref :text-palette-refactor))
(def text-paragraph-refactor (icon-xref :text-paragraph-refactor))
(def text-refactor (icon-xref :text-refactor))
(def text-bottom-refactor (icon-xref :text-bottom-refactor))
(def text-ltr-refactor (icon-xref :text-ltr-refactor))
(def text-rtl-refactor (icon-xref :text-rtl-refactor))
(def text-middle-refactor (icon-xref :text-middle-refactor))
(def text-mixed-refactor (icon-xref :text-mixed-refactor))
(def text-stroked-refactor (icon-xref :text-stroked-refactor))
(def text-top-refactor (icon-xref :text-top-refactor))
(def text-underlined-refactor (icon-xref :text-undelined-refactor))
(def text-uppercase-refactor (icon-xref :text-uppercase-refactor))
(def tick-refactor (icon-xref :tick-refactor))
(def unlock-refactor (icon-xref :unlock-refactor))
(def vertical-align-items-center-refactor (icon-xref :vertical-align-items-center-refactor))
(def vertical-align-items-end-refactor (icon-xref :vertical-align-items-end-refactor))
(def vertical-align-items-start-refactor (icon-xref :vertical-align-items-start-refactor))
(def view-as-icons-refactor (icon-xref :view-as-icons-refactor))
(def wrap-refactor (icon-xref :wrap-refactor))
(def view-as-list-refactor (icon-xref :view-as-list-refactor))
(def loader-pencil
  (mf/html
   [:svg
    {:viewBox "0 0 677.34762 182.15429"
     :height "182"
     :width "667"
     :id "loader-pencil"}
    [:g
     [:path
      {:id "body-body"
       :d
       "M128.273 0l-3.9 2.77L0 91.078l128.273 91.076 549.075-.006V.008L128.273 0zm20.852 30l498.223.006V152.15l-498.223.007V30zm-25 9.74v102.678l-49.033-34.813-.578-32.64 49.61-35.225z"}]
     [:path
      {:id "loader-line"
       :d
       "M134.482 157.147v25l518.57.008.002-25-518.572-.008z"}]]]))

(mf/defc debug-icons-preview
  {::mf/wrap-props false}
  []
  [:section.debug-icons-preview
   (for [[key val] (sort-by first (ns-publics 'app.main.ui.icons))]
     (when (not= key 'debug-icons-preview)
       [:div.icon-item {:key key}
        (deref val)
        [:span (pr-str key)]]))])
