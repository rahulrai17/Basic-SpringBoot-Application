pipeline {
    // Define the agent to run the pipeline on. 'any' means it can run on any available agent.
    agent any

    // Define tools required for the build process.
    tools {
        // Specify the JDK installation name. This should match the name configured in Jenkins.
        jdk 'JDK_22'
        // Specify the Maven installation name. This should match the name configured in Jenkins.
        maven 'Maven_3.9.8'
    }

    // Define the stages of the pipeline.
    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the source control repository.
                checkout scm
            }
        }
        stage('Build') {
            steps {
                // Run Maven clean and package commands to build the project.
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                // Run Maven test command to execute unit tests.
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // Deployment steps, if applicable. Currently, this is a placeholder.
                echo 'Deploying application...'
                // Example: Deploy to a server or cloud service (actual deployment command will depend on your setup).
                // sh 'deploy.sh'
            }
        }
    }

    // Define actions to be taken after all stages are complete.
    post {
        // Actions to always run regardless of the build result.
        always {
            // Clean up the workspace to ensure no leftover files from previous builds.
            cleanWs()
        }
        // Actions to run if the build is successful.
        success {
            // Notify on success or perform additional actions like archiving build artifacts.
            echo 'Build and tests successful!'
        }
        // Actions to run if the build fails.
        failure {
            // Notify on failure or perform additional actions.
            echo 'Build or tests failed.'
        }
    }
}
