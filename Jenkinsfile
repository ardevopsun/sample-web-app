pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/ardevopsun/sample-web-app.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building the application...'
                // Add build commands if needed, e.g., for a Java/Maven or Node.js project
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                // Add test scripts here if available
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application...'
                // Copy files to the web server using SCP (ensure SSH access is configured)
                sh '''
                scp -i /path/to/your-key.pem -r * ubuntu@your-web-server-ip:/var/www/html/
                '''
            }
        }
    }
}
