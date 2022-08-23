#!/usr/bin/env groovy

package com.example


class Docker implements Serializable {

    def script

    Docker(script) {
        this.script = script
    }

    def buildDockerImages(String imageName) {
        script.echo "building the docker image and push..."
        script.sh "docker build -t ${imageName} ."
    }
    def dockerLogin() {
        script.withCredentials([script.usernamePassword(credentialsId: 'dockerHub-Credentials', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        script.sh "echo $script.PASS | docker login -u $script.USER --password-stdin"
        }
    }
    def dockerLogin(String imageName) {
        script.sh "docker push ${imageName}"
    }
}
