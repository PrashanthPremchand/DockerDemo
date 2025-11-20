Here is a **clean, professional, copy-paste ready README.md** for your GitHub repository.

---

# 🐳 Spring Boot + PostgreSQL + Docker Demo

A simple and clean starter project demonstrating how to run a **Spring Boot 3** application with a **PostgreSQL database** using **Docker** and **Docker Compose**.
This template is perfect for beginners, learning Docker, backend portfolio projects, and deployment practice.

---

## 🚀 Features

* **Spring Boot 3.5 + Java 17**
* **PostgreSQL database** running inside a Docker container
* **Dockerized Spring Boot app** using a custom Dockerfile
* ORM using **Spring Data JPA**
* Auto-creation of tables using Hibernate
* Includes REST API endpoints for CRUD operations
* Clean folder structure & simple code to understand
* Uses `CommandLineRunner` to insert a sample record at startup

---

## 📁 Project Structure

```
docker-demo/
 ├── src/main/java/com/prashanth/docker_demo/
 │     ├── DockerDemoApplication.java
 │     ├── DockerDemoEntity.java
 │     ├── DockerDemoRepository.java
 │     └── DockerDemoController.java
 ├── src/main/resources/application.yml
 ├── Dockerfile
 ├── docker-compose.yml
 └── pom.xml
```

---

## 🛠️ How to Run the Project

### 1️⃣ Build the application

```bash
mvn clean package -DskipTests
```

### 2️⃣ Start Docker containers

```bash
docker-compose up --build
```

### 3️⃣ Access the application

API Base URL:

```
http://localhost:8081/app/v1/docker_demo
```

Example Endpoints:

| Method | Endpoint          | Description         |
| ------ | ----------------- | ------------------- |
| GET    | `/get_all`        | Fetch all records   |
| GET    | `/get_by_id?id=1` | Fetch record by ID  |
| POST   | `/save`           | Create a new record |

Sample POST Body:

```json
{
  "name": "Docker",
  "description": "Sample record"
}
```

### 4️⃣ Stop the containers

```bash
docker-compose down
```

---

## 📦 Docker Setup Overview

### **Dockerfile**

* Builds a lightweight image using Eclipse Temurin (OpenJDK)
* Copies the jar into `/app`
* Exposes port `8080` for the application

### **docker-compose.yml**

* Creates two services:

  * `postgres` → PostgreSQL DB with credentials
  * `spring_boot_app` → Your Spring Boot service
* Containers communicate through a custom Docker network
* PostgreSQL data stored using a named Docker volume

---

## 🏗️ Technologies Used

* Java 17
* Spring Boot 3
* Spring Web
* Spring Data JPA
* PostgreSQL
* Lombok
* Docker & Docker Compose

---

## 🎯 Purpose of This Project

This project gives beginners and job seekers practical exposure to:

* Running Java applications in Docker
* Connecting Spring Boot to databases in containers
* Deploying a real backend environment
* Creating portfolio-ready backend projects

---

