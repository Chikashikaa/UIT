pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh "mvn compile"
                sh "mvn clean package"
            }
            post {
                success {
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
