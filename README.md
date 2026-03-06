Your content is good but the **formatting is messy and inconsistent** (capitalization, spacing, numbered list, sections). GitHub README should use **Markdown headings, lists, and code blocks** so it renders cleanly.

Here’s a **properly structured and polished README version** you can paste directly into `README.md`.

---

# Scientific Calculator – DevOps CI/CD Pipeline

This project is developed as part of the **SPE Mini Project** and demonstrates the implementation of a **DevOps-based CI/CD pipeline** for a Scientific Calculator application.

The calculator is implemented in **Java** and supports several mathematical operations. The project integrates multiple DevOps tools to automate important stages of the software development lifecycle such as **building, testing, containerization, and deployment**.

The main objective of this project is to implement a **Continuous Integration and Continuous Deployment (CI/CD) pipeline** that automates the process of building, testing, packaging, and deploying the application.

---

# DevOps Pipeline Overview

The automated pipeline performs the following steps:

### 1. Source Code Management

The source code is stored and version controlled using **Git** and **GitHub**.

### 2. Build Automation

**Maven** is used to compile the project and generate an executable **JAR file**.

### 3. Automated Testing

**JUnit** is used to execute unit tests that verify the correctness of the application logic.

### 4. Continuous Integration

**Jenkins** automatically triggers the pipeline whenever new code is pushed to the repository.

### 5. Containerization

**Docker** packages the application into a container image to ensure consistent execution across environments.

### 6. Deployment Automation

**Ansible** deploys the Docker container and runs the application automatically.

---

# Project Architecture

```
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
```

---

# Project Structure

```
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
```

---

# Scientific Calculator Features

The command-line calculator supports the following operations:

* Square Root (√x)
* Factorial (x!)
* Natural Logarithm (ln(x))
* Power Function (x^b)
* Exit

---

# Application Type

Command Line Interface (CLI) Scientific Calculator.

---

If you want, I can also show you **3 small additions that make a GitHub README look much more professional** (like badges, screenshots, and pipeline status). Those are the things that make repos look **industry-level instead of student projects**.

5. Exit
