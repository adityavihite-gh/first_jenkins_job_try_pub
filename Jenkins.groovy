pipeline {
    agent any

    environment {
        EXAMPLE_CREDS = credentials('slack-id')
    }

    stages {
        stage('Example') {
            steps {
                echo "Hello"
                echo "${EXAMPLE_CREDS_USR}:${EXAMPLE_CREDS_PSW}"
            }
        }
    }
}