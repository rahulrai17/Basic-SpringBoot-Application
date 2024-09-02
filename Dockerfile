# Use a base image with OpenJDK 22
FROM openjdk:22-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the host machine to the container
# Make sure to build your project with Maven before copying the JAR file
COPY target/Basic-SpringBoot-Application-0.0.1-SNAPSHOT.jar /app/Basic-SpringBoot-Application.jar

# Expose the port the application runs on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "Basic-SpringBoot-Application.jar"]
