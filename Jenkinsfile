pipeline {
    agent any
    environment {
        DOCKER_IMAGE_NAME = 'calculator'
        GITHUB_REPO_URL = 'https://github.com/Chahak02/SPE_calculator.git'
        DOCKER_REGISTRY = 'docker.io'
        DOCKER_USERNAME = 'chahak02'
        IMAGE_TAG = '0.0.1'
    }
    stages {
        stage('Checkout') {
            steps {
                script {
                    git branch: 'main', url: "${GITHUB_REPO_URL}"
                }
            }
        }
        stage('Build and Test') {
            steps {
                script {
                    sh 'mvn clean install'
                }
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    docker.build("${DOCKER_IMAGE_NAME}:${IMAGE_TAG}", '.')
                    // Optionally, also tag the image as "latest" for consistency
                    docker.build("${DOCKER_IMAGE_NAME}:latest", '.')
                }
            }
        }
        stage('Push Docker Image') {
            steps {
                script {
                    docker.withRegistry('', 'DockerHubCred') {
                        // Tag the image with the appropriate version and latest
                        sh "docker tag ${DOCKER_IMAGE_NAME}:${IMAGE_TAG} ${DOCKER_REGISTRY}/${DOCKER_USERNAME}/calculator:${IMAGE_TAG}"
                        sh "docker tag ${DOCKER_IMAGE_NAME}:${IMAGE_TAG} ${DOCKER_REGISTRY}/${DOCKER_USERNAME}/calculator:latest"

                        // Push both the versioned tag and latest tag
                        sh "docker push ${DOCKER_REGISTRY}/${DOCKER_USERNAME}/scientific-calculator:${IMAGE_TAG}"
                        sh "docker push ${DOCKER_REGISTRY}/${DOCKER_USERNAME}/scientific-calculator:latest"
                    }
                }
            }
        }
        stage('Run Ansible Playbook') {
            steps {
                script {
                    ansiblePlaybook(
                        playbook: 'deploy.yml',
                        inventory: 'inventory.ini',
                        extras: '-K'
                    )
                }
            }
        }
    }
    post {
        success {
            echo 'Pipeline successfully completed!'
            emailtext(
                to:'chahakagarwal02@gmail.com',
                subject: 'Build success: Scientific Calculator',
                body: 'The Jenkins pipeline for the Scientific calculator project has completed successfully.'
            )
        }
        failure {
            echo 'Pipeline failed!'
            emailtext(
                to:'chahakagarwal02@gmail.com',
                subject: 'Build failure: Scientific Calculator',
                body: 'The Jenkins pipeline for the Scientific calculator project has failed.'
            )
        }
    }
}
