pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
               echo 'mvn clean compile'
            }
        }
        stage('Package') {
            steps {
                echo 'mvn package'
            }
        }
        stage('Archive') {
            steps {
                echo 'archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true'
            }
        }
    }
}
