pipeline {
    agent any
    tools {
        maven 'maven-3.3.9'
    }
    stages {

        stage ('Build') {
            steps {
                echo 'This is a minimal pipeline.'

                sh "mvn clean package"
            }
        }
    }
}