#!/usr/bin/env groovy

def call () {
    echo "building the application for brance..."
    sh 'mvn package'
}
