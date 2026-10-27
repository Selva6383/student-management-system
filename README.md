# Student Management REST API

A RESTful API built using Java, Spring Boot, Spring Data JPA, and MySQL to manage student records through CRUD operations.

## 🚀 Features

* Create a student record
* Retrieve all students
* Retrieve a student by ID
* Update student details
* Delete a student record
* Validate incoming requests
* Handle exceptions centrally

## 🛠️ Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* Postman

## 🏗️ Architecture

The application follows a layered architecture:

* **Controller:** Handles HTTP requests and responses.
* **Service:** Contains business logic.
* **Repository:** Handles database operations using Spring Data JPA.
* **Model:** Represents student data through the Student entity.

## 📌 API Endpoints

Base URL: `http://localhost:8080/api/students`

| Method | Endpoint             | Description              |
| ------ | -------------------- | ------------------------ |
| GET    | `/api/students`      | Retrieve all students    |
| GET    | `/api/students/{id}` | Retrieve a student by ID |
| POST   | `/api/students`      | Create a student         |
| PUT    | `/api/students/{id}` | Update a student         |
| DELETE | `/api/students/{id}` | Delete a student         |

## 📝 Sample Request

Example JSON for creating a student:

```json
{
  "name": "Arun Kumar",
  "email": "arun@example.com",
  "course": "B.Tech CSE",
  "age": 21
}
```

Use the actual field names defined in your Student entity when testing the API.

## ⚙️ How to Run

### Prerequisites

* Java JDK
* Maven
* MySQL Server
* IntelliJ IDEA or another Java IDE

### Steps

1. Clone the repository:

   ```bash
   git clone https://github.com/Selva6383/student-management-system.git
   ```

2. Open the project in your IDE.

3. Configure the MySQL username, password, and database settings in `src/main/resources/application.properties`.

4. Start MySQL.

5. Run the application:

   ```bash
   mvn spring-boot:run
   ```

6. Test the API endpoints using Postman.

## 🧪 Key Technical Concepts

* **Layered Architecture:** Separates controllers, services, and repositories.
* **Spring Data JPA:** Simplifies database operations.
* **Dependency Injection:** Connects application components.
* **Validation:** Uses request validation to help prevent invalid data.
* **Exception Handling:** Centralizes error handling for API requests.

## 👨‍💻 Author

**Selvaganapathy S**

GitHub: [Selva6383](https://github.com/Selva6383)

