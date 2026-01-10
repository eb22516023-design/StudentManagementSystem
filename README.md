🎓 Student Management System (Spring Boot)

A simple Student Management System built with Spring Boot, Spring Data JPA, and MySQL.
This project demonstrates CRUD operations, RESTful APIs, and global exception handling, as required for academic coursework.

📌 Features

Create a new student

View all students

View a student by ID

Delete a student

Persistent storage using MySQL

Global exception handling (@RestControllerAdvice)

REST API testing using IntelliJ HTTP Client (test.http)

🛠️ Technologies Used

Java 17+

Spring Boot

Spring Data JPA

Hibernate

MySQL

Maven

IntelliJ IDEA

📂 Project Structure
src
├── main
│   ├── java
│   │   └── com.utg.studentmanagement
│   │       ├── controller
│   │       │   └── StudentController.java
│   │       ├── entity
│   │       │   └── Student.java
│   │       ├── exception
│   │       │   ├── StudentNotFoundException.java
│   │       │   └── GlobalExceptionHandler.java
│   │       ├── repository
│   │       │   └── StudentRepository.java
│   │       ├── service
│   │       │   └── StudentService.java
│   │       └── StudentManagementApplication.java
│   └── resources
│       └── application.properties
└── test
    └── test.http

⚙️ Database Configuration

Create a MySQL database:

CREATE DATABASE student_management_db;


Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/student_management_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

🚀 Running the Application

Open the project in IntelliJ IDEA

Run:

StudentManagementApplication.java


Application starts at:

http://localhost:8080

🔁 API Endpoints
➕ Create Student
POST http://localhost:8080/students
Content-Type: application/json

{
  "name": "Ebrima Bah",
  "email": "ebah267@gmail.com",
  "course": "Information System"
}

📋 Get All Students
GET http://localhost:8080/students

🔍 Get Student by ID
GET http://localhost:8080/students/1


If ID does not exist:

404 - Student with ID 999 not found

❌ Delete Student
DELETE http://localhost:8080/students/1

⚠️ Exception Handling

The application uses global exception handling to handle errors gracefully.

Example:

Requesting a non-existing student:

GET /students/999


Response:

404 - Student with ID 999 not found


Implemented using:

StudentNotFoundException

@RestControllerAdvice

🧪 Testing

API requests are tested using IntelliJ HTTP Client.

File location:

src/test/test.http


Click the Run ▶️ button next to each request to test.

📄 Academic Purpose

This project was developed to fulfill coursework requirements, including:

CRUD operations

Database integration

REST APIs

Exception handling

GitHub version control

👤 Author

Ebrima Bah
Modou Lamin Sama
Mama Marong
Bubacarr Demba
Isatou A Jallow
University of The Gambia (UTG)
Course: Computer Programming II
