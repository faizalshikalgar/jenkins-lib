#!/usr/bin/env groovy

def call() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'dockerHub-Credentials', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t faizalshikalgar/demo-app:jma-2.1 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push faizalshikalgar/demo-app:jma-2.1'
    }
}