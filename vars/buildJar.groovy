#!/usr/bin/env groovy

def call () {
    echo "building the application for branch $BUILD_TAG"
    sh 'mvn package'
}
