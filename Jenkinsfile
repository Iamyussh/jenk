pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Iamyussh/jenk.git'
            }
        }

        stage('Compile Java') {
            steps {
                script {
                    echo 'Compiling Java files...'
                    sh 'mkdir -p out'
                    sh 'javac -d out src/*.java'
                }
            }
        }

        stage('Run App') {
            steps {
                script {
                    echo 'Running the application...'
                    sh 'java -cp out galat'
                }
            }
        }
    }

    post {
        success {
            echo '✅ Build succeeded!'
        }
        failure {
            echo '❌ Build failed! Check logs above.'
        }
    }
}

