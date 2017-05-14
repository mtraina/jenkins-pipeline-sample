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
    sh 'kill -9 $(cat application.pid) || true'

    stage 'run application'
    sh "java -jar build/libs/jenkins-pipeline-sample-0.0.1-SNAPSHOT.jar &"
    waitUntil {
        def r = sh script: 'curl http://localhost:9080/greeting', returnStatus: true
        echo 'returned = ' + r
        return r == 0
    }

    stage 'test endpoint'
    def result = sh(script: 'curl http://localhost:9080/greeting', returnStdout: true).trim()
    echo "result is: $result"

    stage 'compare response'
    echo "result is: $result"
    sh "$result = {"text":"hello world"}"
}