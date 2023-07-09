# Ecommerce API

## Framework and Language Used
- Framework: Spring Boot
- Language: Java

## Database Configuration
The application uses an SQL database, and the database connection details can be configured in the `application.properties` file:

- spring.datasource.url: JDBC URL of the database
- spring.datasource.username: Username for the database
- spring.datasource.password: Password for the database
- spring.datasource.driverClassName: Driver class name for the database connection
- spring.jpa.hibernate.ddl-auto: Hibernate DDL auto configuration
- spring.jpa.properties.hibernate.show_sql: Enable SQL query logging
- spring.jpa.properties.hibernate.use_sql_comments: Enable SQL comments in query logs
- spring.jpa.properties.hibernate.format_sql: Format SQL queries for better readability

## Data Flow
The data flow in the project follows the typical MVC (Model-View-Controller) pattern:

- Controllers: Handle incoming HTTP requests, validate inputs, and coordinate the flow of data between the client and the service layer.
- Services: Contain the business logic of the application, perform operations on the entities, and interact with the repositories.
- Repositories: Provide the interface to interact with the underlying database.
- Database: Stores the entities and their related data.

## Database Design
The project uses an SQL database with the following entity structure:

- User: Represents a user with attributes such as id, name, email, password, and phoneNumber.
- Product: Represents a product with attributes such as id, name, price, description, category, and brand.
- Address: Represents an address with attributes such as id, name, landmark, phoneNumber, zipcode, state, and userID (foreign key mapping).
- Order: Represents an order with attributes such as id, userID (foreign key mapping), productID (foreign key mapping), addressID (foreign key mapping), and productQuantity.

>## API Documentation
The API endpoints will be available at http://localhost:8080.

## Data Structure Used in the Project
- User: Represents a user with various attributes and associated methods.
- Product: Represents a product with various attributes and associated methods.
- Address: Represents an address with various attributes and associated methods.
- Order: Represents an order with various attributes and associated methods.

## Project Summary
The Ecommerce API project is a Spring Boot-based application that provides APIs for managing users, products, addresses, and orders.

The project includes separate controllers for handling CRUD operations on users, products, addresses, and orders. The controllers expose various endpoints to create, read, update, and delete entities.
