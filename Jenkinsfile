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
               # scp -i /home/ec2-user/sample-web-app/new_key.pem -r * ec2-user@54.198.115.205:/var/www/html/
               scp -i /home/ec2-user/sample-web-app/new_key.pem -o StrictHostKeyChecking=no -o UserKnownHostsFile=/dev/null -r * ec2-user@54.198.115.205:/var/www/html/
                 '''
            }
        }
    }
}
