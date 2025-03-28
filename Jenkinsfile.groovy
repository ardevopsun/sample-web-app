pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/ardevopsun/CI-CD-Pipeline-with-Jenkins-on-AWS.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Building the application...'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
            }
        }
        stage('Deploy') {
            steps {
                sh '''
                scp -i /path/to/key.pem -o StrictHostKeyChecking=no index.html ubuntu@your-ec2-web-server:/var/www/html/
                '''
            }
        }
    }
}
