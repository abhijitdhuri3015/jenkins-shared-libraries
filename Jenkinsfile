@Library('shared') _
pipeline {
    agent { label 'agent1' }

    stages {
        stage('Hello1') {
            steps {
                script {
                    hello() // calling the shared library function
                }
            }
        }
        stage('cloning'){
            steps{
                script{
                    code("https://github.com/abhijitdhuri3015/django-notes-app.git", "main")
                }
            }
        }
    }
}
