#!/usr/bin/env groovy

def call () {
    echo "building the application for branch ${BUILD_NUMBER}"
    sh 'mvn package'
}
