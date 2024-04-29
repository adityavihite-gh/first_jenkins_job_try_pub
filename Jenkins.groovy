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
                    bat 'pip install pandas'
                    bat 'pip install axonius-api-client'
                    bat 'pip install snowflake-connector-python'
                }
                
            }
        }
    }
}