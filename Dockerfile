# Use the official Docker image as the base image for the services
FROM docker:latest

# Install curl for downloading assets
RUN apk --no-cache add curl

# Create and set the working directory
WORKDIR /app

# Copy the docker-compose.yaml file from the "Docker" subfolder into the container
COPY Docker/docker-compose.yaml .

# Install Docker Compose
RUN apk --no-cache add docker-compose

# Expose the relevant ports (you might need to adjust based on your needs)
EXPOSE 9001
EXPOSE 1025
EXPOSE 1080

# Launch Penpot using Docker Compose
CMD ["docker-compose", "-f", "docker-compose.yaml", "up"]
