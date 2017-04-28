#!groovy

node {
    stage 'clone sources'
    git url: 'https://github.com/mtraina/jenkins-pipeline-sample.git'

    stage 'gradle build'
    sh "./gradlew clean build"
}