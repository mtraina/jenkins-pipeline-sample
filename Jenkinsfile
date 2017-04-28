#!groovy

node {
    def rtGradle = Artifactory.newGradleBuild()

    stage 'clone sources'
    git url: 'https://github.com/mtraina/jenkins-pipeline-sample.git'

    stage 'gradle build'
    def buildInfo = rtGradle.run rootDir: "./", buildFile: 'build.gradle', tasks: 'clean build'
}