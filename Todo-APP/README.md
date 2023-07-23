# To-Do-APP

## Framework and Language Used
- Framework: Spring Boot
- Language: Java

## Entity
- todo id: Integer
- todoName: String
- isTodoDoneStatus:  boolean


## Controllers
### EmployeeController
- GET /todos - Get all todos
- GET /todo/done - Get all done todos
- GET /todo/undone - Get all un-done todos
- POST /todo - Create a new todo
- PUT / todo/{todoId}/{status} - Update todo with status
- DELETE /todo - Delete todo


## Data Flow
The data flow in the project follows the typical MVC (Model-View-Controller) pattern:

- Controllers: Handle incoming HTTP requests, validate inputs, and coordinate the flow of data between the client and the service layer.
- Service: Contains the business logic of the application, performs operations on the entities, and interacts with the repositories.
- Repositories: Provide the interface to interact with the underlying database.
- Database: Stores the Employee and Address entities and their related data.

## Project Summary

In this todo application we had the basic CRUD Operation and make API regarding it by taking the entities parameter as todoId , todoName and isTodoDoneStatus.
This project can be run in localhost or postman.
