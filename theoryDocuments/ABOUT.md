# Basic Spring Boot Application

## Objective

This project is a basic Spring Boot application created to demonstrate the fundamental concepts of Spring Boot, Jenkins CI/CD, and Docker. The primary goal is to set up a working Spring Boot application, build it using Maven, and deploy it in a containerized environment using Docker. The application also integrates with Jenkins for continuous integration and continuous deployment (CI/CD).

## Application Overview

The application is a simple Spring Boot project with a single REST API endpoint:

- **Endpoint:** `/hello`
- **Response:** Returns a greeting message `"Hello, Spring Boot!"`

This basic setup serves as a foundation for further enhancements and integration with other tools.

## Technologies Used

### 1. Java
- **Version:** Java 22
- Java is the primary programming language used to develop the Spring Boot application.

### 2. Spring Boot
- **Version:** 3.3.3
- Spring Boot simplifies the development of Java-based applications by providing pre-configured starter templates and an embedded server.

### 3. Maven
- **Version:** 3.9.8
- Maven is used as the build tool for the project. It handles dependencies, compiles the code, runs tests, and packages the application as a JAR file.

### 4. Docker
- Docker is used to containerize the Spring Boot application. The Dockerfile defines how the application is packaged into an image and run as a container.

### 5. Jenkins
- Jenkins is used for continuous integration and deployment. The `Jenkinsfile` defines the pipeline steps to build, test, and deploy the application automatically.

## Project Structure

The project follows the standard Maven directory structure:

```markdown


Basic-SpringBoot-Application/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/Basic_SpringBoot_Application/
│   │   │       └── BasicSpringBootApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/example/Basic_SpringBoot_Application/
│               └── BasicSpringBootApplicationTests.java
│
├── Dockerfile
├── Jenkinsfile
├── pom.xml
└── README.md
```

### Key Files:
- **`pom.xml`**: Defines project dependencies and build configurations.
- **`BasicSpringBootApplication.java`**: The main entry point of the application with the `/hello` endpoint.
- **`Dockerfile`**: Instructions for building and running the application in a Docker container.
- **`Jenkinsfile`**: Defines the Jenkins pipeline for CI/CD.

## How to Run the Application

### Prerequisites:
- Java 22 installed
- Maven 3.9.8 installed
- Docker installed
- Jenkins installed (if using CI/CD)

### Steps to Run:

1. **Build the Application:**
   ```bash
   mvn clean install
   ```

2. **Run Locally:**
   ```bash
   mvn spring-boot:run
   ```

3. **Build Docker Image:**
   ```bash
   docker build -t spring-boot-app .
   ```

4. **Run Docker Container:**
   ```bash
   docker run -p 8080:8080 spring-boot-app
   ```

5. **Access the Application:**
   Open your browser and go to `http://localhost:8080/hello` to see the greeting message.

## CI/CD with Jenkins

The `Jenkinsfile` in this project is configured to:
1. Pull the code from the Git repository.
2. Build the project using Maven.
3. Run tests to ensure code quality.
4. Build a Docker image of the application.
5. Deploy the Docker container.

