#!/usr/bin/env groovy

def call () {
    echo "building the application for branch ${JOB_NAME}"
    sh 'mvn package'
}
