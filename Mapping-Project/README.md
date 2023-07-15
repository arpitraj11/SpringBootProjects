# Mapping Project

## Framework and Language Used
- Framework: Spring Boot
- Language: Java

## Data Flow
The data flow in the project follows the typical MVC (Model-View-Controller) pattern:

- Controllers: Handle incoming HTTP requests, validate inputs, and coordinate the flow of data between the client and the service layer.
- Services: Contain the business logic of the application, perform operations on the entities, and interact with the repositories.
- Repositories: Provide the interface to interact with the underlying database.
- Database: Stores the entities and their related data.

## Database Design
The project uses a database to store the entities and their relationships. The design includes the following entities:

- Student: Represents a student with attributes such as ID, name, age, phoneNumber, branch, department, and address.
- Laptop: Represents a laptop with attributes such as ID, name, brand, price, and a one-to-one relationship with a student.
- Course: Represents a course with attributes such as ID, title, description, duration, and a many-to-many relationship with students.
- Book: Represents a book with attributes such as ID, title, author, description, price, and a many-to-one relationship with a student.
- Address: Represents an address with attributes such as addressId, landmark, zipcode, district, state, and country.

## Data Structure Used in the Project
- Student: Represents a student with various attributes and associated methods.
- Laptop: Represents a laptop with various attributes and associated methods.
- Course: Represents a course with various attributes and associated methods.
- Book: Represents a book with various attributes and associated methods.
- Address: Represents an address with various attributes and associated methods.

## Project Summary
The Relationship Portal project is a Spring Boot-based application that provides APIs for managing relationships between students, laptops, courses, books, and addresses.

The project includes separate controllers for handling CRUD operations on students, laptops, courses, books, and addresses. The controllers expose various endpoints to create, read, update, and delete entities.

