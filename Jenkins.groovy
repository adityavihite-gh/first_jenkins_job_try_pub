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
                    sh 'pip install pandas'
                    sh 'pip install axonius-api-client'
                    sh 'pip install snowflake-connector-python'
                }
                
            }
        }
    }
}