<h1 align="center"> 
Instagram-Inspired Spring Boot Application </h1>
This is an Instagram-inspired project built with Spring Boot. The user controller handles various user-related operations in the application. The project exposes RESTful endpoints for user management, authentication, liking posts, following other users, and more.

>### Prerequisites
* ![MySql](https://img.shields.io/badge/DBMS-MYSQL%205.7%20or%20Higher-red)
 * ![SpringBoot](https://img.shields.io/badge/Framework-SpringBoot-green)


* ![Java](https://img.shields.io/badge/Language-Java%208%20or%20higher-yellow)

>## Installation

To run this application locally, you will need to have Java and MySQL installed on your machine.

* Clone the repository to your preferred IDE.

* Update the `application.properties` file in the `src/main/resources` directory to include your MySQL username and password
* Run the application using your IDE or by running the command `mvn spring-boot:run` in the project directory
* Access the APIs using any HTTP client such as Postman or cURL.
  
>## Data flow
 The application is built using the SpringBoot framework and consists of three layers: model, service, and repository.-

* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer mainatains the h2-database thing on which CRUD operations are performed
* **Model** - This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored.

>## Schema
The following schemas are used in the project:

* **User:** Represents user information including user ID, name, Instagram details, password, email, phone number, blue tick status, and date of birth.
* **SignUpOutput:** Contains the status and message of the sign-up operation.
SignInInput: Includes the email and password for user authentication during sign-in.
* **SignInOutput:** Provides the status and token after successful user authentication.
* **Post:** Represents a post with a post ID, creation date, post data, caption, location, and associated user.
* **PostLike:** Represents a like given to a post, including the like ID, the post being liked, and the user who liked it.
* **InstagramComment:** Represents a comment on a post, including the comment ID, comment body, the post being commented on, and the user who made the comment.

Please note that the actual implementation and details of these schemas may vary within the project code.

> ##Endpoints

* PUT /user
Update user information.

* POST /user/signup
Create a new user account.

* POST /user/signin
Authenticate and sign in a user.

* POST /user/like
Like a post.

* POST /user/follow/{myId}/{otherId}
Follow another user.

* DELETE /user/signout
Sign out the currently authenticated user.

* Admin Controller
The project also includes an admin controller for administrative tasks.

* PUT /admin/user/{id}/{blueTick}
Assign a blue tick (verification badge) to a user.

* Post Controller
The post controller handles post-related operations.

* GET /post
Retrieve all posts.

* POST /post
Create a new post.

* GET /post/{postId}/likeCount
Get the number of likes for a specific post.

* Comment Controller
The comment controller manages comments on posts.

* POST /comment
Add a new comment to a post.

>## Project Summary
This project is an Instagram-inspired application developed using Spring Boot. It aims to provide users with a platform to share and interact with posts, follow other users, like posts, and comment on them. The project utilizes RESTful APIs to expose various endpoints for user management, authentication, post handling, and comment management.

The project provides a solid foundation for building an Instagram-like application using Spring Boot. Developers can extend and enhance the functionality by adding additional features such as user profiles, direct messaging, explore pages, and image/video uploads.
