### How a Normal Spring Boot Application Runs Without Docker:

1. **Before Build:**
    - **Write Code:** You write your Spring Boot application code in Java.
    - **Project Setup:** You organize your project with files like `pom.xml` (for Maven) and your source code files.
    - **Run Locally:** You can run the application using an IDE (like IntelliJ or Eclipse) or using a command like `mvn spring-boot:run` in the terminal. This command compiles your code and starts the Spring Boot application on your local machine.

2. **After Build:**
    - **Build the Application:** When you run `mvn clean install` or `mvn package`, Maven compiles your Java code and packages it into a single JAR file (e.g., `app.jar`).
    - **Run the JAR:** After building, you can run your application using `java -jar app.jar`. This starts the Spring Boot application on your machine. The app is still tied to your local environment, so it depends on your local Java installation, network settings, etc.

### How Dockerfile Works for Running a Spring Boot Application:

**Docker** allows you to package your Spring Boot application along with all its dependencies into a container, so it can run consistently on any system that has Docker installed.

1. **Before Docker:**
    - You write and build your Spring Boot application like usual (`mvn package` to get the JAR).
    - You could run this JAR directly on your system using `java -jar`, but this requires you to have the right version of Java installed, and you need to handle configurations.

2. **With Docker:**
    - **Create a Dockerfile:** This file tells Docker how to set up the environment for your application. It defines the steps:
        - Start with a base image that has Java (like `openjdk`).
        - Set up a directory to work in.
        - Copy your JAR file into the container.
        - Specify the command to run the JAR when the container starts.

3. **Building the Docker Image:**
    - When you run `docker build -t spring-boot-app .`, Docker reads the Dockerfile and creates an image. This image contains everything needed to run your Spring Boot application, including the JAR and the Java runtime.

4. **Running the Application with Docker:**
    - When you run `docker run -p 8080:8080 spring-boot-app`, Docker starts a container from the image. Inside the container, your Spring Boot application runs just like it would on your machine.
    - The advantage is that Docker isolates the app from your local system, so it will run the same way anywhere, regardless of the underlying environment.

### Summary of Differences:
- **Without Docker:** Your app runs directly on your system, dependent on your local environment.
- **With Docker:** Your app runs in a container, which includes everything it needs. This makes it portable and consistent across different environments.

In simpler terms, Docker packages your app into a "box" with all the tools it needs, so it can run anywhere without worrying about system differences.