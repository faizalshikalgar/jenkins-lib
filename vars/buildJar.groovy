#!/usr/bin/env groovy

def call () {
    echo "building the application for brance $BRANCH_NAME"
    sh 'mvn package'
}