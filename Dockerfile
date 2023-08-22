# Use the official Docker image as the base image
FROM docker:latest

# Install curl
RUN apk --no-cache add curl

# Download the docker-compose.yaml file
RUN curl -o docker-compose.yaml https://raw.githubusercontent.com/penpot/penpot/main/docker/images/docker-compose.yaml

# Install Docker Compose
RUN apk --no-cache add docker-compose

# Create and set the working directory
WORKDIR /app

# Copy the downloaded docker-compose.yaml into the container
COPY docker-compose.yaml .

# Launch Penpot using Docker Compose
CMD ["docker-compose", "-p", "penpot", "-f", "docker-compose.yaml", "up", "-d"]

# Expose the required port
EXPOSE 9001
