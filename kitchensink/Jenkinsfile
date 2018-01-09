pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                mvn clean compile
            }
        }
        stage('Package') {
            steps {
                mvn package
            }
        }
        stage('Archive') {
            steps {
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
    }
}
