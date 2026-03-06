**Scientific Calculator - DevOps CI/CD Pipeline**

This is SPE mini-project 'Scientific Calculator' which demonstrates the implementation of a DevOps-based CI/CD pipeline for a Scientific Calculator application. The calculator is developed in Java and supports several mathematical operations.The project integrates multiple DevOps tools to automate the process such as build, test, containerization and deployment of the application.

The objective of this project is to implement CI/CD pipeline in order to automate different stages of software development lifecycle.

**Deveops Pipeline Overview:**
The project implements an automated pipeline that performs the following steps:
  1.**Source Code Management**
    -Code is stored and version controlled using Git and GitHub
  2.**Build Automation**
    -Maven is used to compile the project and generate an executable JAR file.
  3.**Automated Testing**
    -JUnit is used to run unit test to verify application logic.
  4.**Continuous Integration**
    -jenkins automatically triggers the pipeline when code are pushed
  5.**Containerization**
    -Docker packages the application into a container image
  6.**Deployment Automation** 
    -Ansible deploys the container and runs the application.

**PROJECT ARCHITECTURE**
    Developer
    │
    │ Push Code
    ▼
GitHub Repository
    │
    │ Trigger Pipeline
    ▼
Jenkins CI Pipeline
    │
    ├── Run JUnit Tests
    ├── Maven Build
    ├── Create JAR
    ├── Build Docker Image
    └── Push Image to Docker Hub
    │
    ▼
Ansible Deployment
    │
    ▼
Docker Container Running Calculator

**PROJECT STRUCTURE**
Calculator
│
├── src
│   ├── main/java
│   └── test/java
│
├── Dockerfile
├── Jenkinsfile
├── deploy.yml
├── inventory.ini
├── pom.xml
└── README.md
**Command Line Interface (CLI)**
Scientific Calculator

1. Square Root (√x)
2. Factorial (!x)
3. Natural Logarithm (ln(x))
4. Power Function (x^b)
5. Exit
