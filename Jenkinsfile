pipeline {
    agent any
    tools {
        maven 'Maven 3.3.9'
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