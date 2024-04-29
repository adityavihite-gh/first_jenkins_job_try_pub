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
                    bat 'pip3 install pandas'
                    bat 'pip3 install axonius-api-client'
                    bat 'pip3 install snowflake-connector-python'
                }
                
            }
        }
    }
}