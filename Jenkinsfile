#!groovy
// Run docker build
properties([disableConcurrentBuilds()])

pipeline {
    agent any

    options {
        buildDiscarder(logRotator(numToKeepStr: '10', artifactNumToKeepStr: '5'))
        timestamps()
    }

    stages {
        stage("clone project") {
            steps {
                checkout scm
            }
        }

        stage("docker build") {
            steps {
                sh 'docker build --no-cache -t backend .'
            }
        }
        stage("docker delete old container") {
            steps {
                sh 'docker rm -f backend'
            }
        }
        stage("docker run image") {
            steps {
                sh 'docker run -d --privileged -p 8080:8080 backend'
            }
        }
    }
}