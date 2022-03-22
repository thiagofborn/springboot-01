pipeline {
    agent any

    tools {
        mave 'local_maven'
    }
    parameters {
        string(name: 'tomcat_staging', defaultValue: '192.168.0.123', description: 'Remote Staging Server' )
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
            post {
                success {
                    echo 'Archiving the artifacts'
                    archiveArtifacts: '**/target/*.war'
                }
            }
        }
    }
    stage ('Deployments') {
        parallel {
            stage ("Deploy to Staging") {
                steps {
                    sh "scp -v -o StrictHostKeyChecking=no **/*.war born@{params.tomcat_staging}:9090":/opt/tomcat/webapps/"
                }
            }
        }
    }
}