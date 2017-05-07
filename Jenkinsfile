#!groovy

node {
    stage 'clone sources'
    git url: 'https://github.com/mtraina/jenkins-pipeline-sample.git'

    stage 'gradle build'
    try {
        sh "./gradlew clean build --continue"
    }
    finally {
        junit '**/build/test-results/test/*.xml'
    }

    stage 'kill deployed application'
    sh 'kill -9 $(cat application.pid)'

    stage 'run application'
    sh "java -jar build/libs/jenkins-pipeline-sample-0.0.1-SNAPSHOT.jar &"

    stage 'test endpoint'
    sh "result=\$(curl http://localhost:9080/greeting)"

    stage 'compare response'
    echo 'to be implemented'

    stage 'kill application'
    echo 'to be implemented'
}