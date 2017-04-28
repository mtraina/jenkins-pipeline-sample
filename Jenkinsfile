#!groovy

node {
    stage 'clone sources'
    git url: 'https://github.com/mtraina/jenkins-pipeline-sample.git'

    stage 'gradle build'
    sh "./gradlew clean build"

    stage 'run application'
    sh "java -jar build/libs/jenkins-pipeline-sample-0.0.1-SNAPSHOT.jar"

    stage 'test endpoint'
    sh "response=\$(curl http://localhost:8080/greeting"

    stage 'compare response'
    echo 'to be implemented'

    stage 'kill application'
    echo 'to be implemented'
}