#!groovy
// Run docker build
properties([disableConcurrentBuilds()])

pipeline {
    agent any

    options {
        buildDiscarder(logRotator(numToKeepStr: '10', artifactNumToKeepStr: '5'))
        timestamps()
    }

    def app

    stages {
        stage("clone repository") {
            steps {
                checkout scm
            }
        }
        stage("docker build") {
            steps {
                docker.build('backend', '--no-cache')
            }
        }
        /* stage("docker delete old container") {
            steps {
                sh 'docker rm -f backend'
            }
        } */
        stage("docker run image") {
            steps {
                docker.image('backend').withRun("--privileged -p 8080:8080") { c ->

                }
            }
        }
    }
}