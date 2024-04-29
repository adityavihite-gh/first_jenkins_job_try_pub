pipeline {
    agent any

    environment {
        EXAMPLE_CREDS = credentials('slack-id')
    }

    stages {
        stage('Install dependencies') {
            steps {
                script{
                    echo "Hello"
                    sh 'pip3 install pandas'
                    sh 'pip3 install axonius-api-client'
                    sh 'pip3 install snowflake-connector-python'
                }
                
            }
        }
    }
}