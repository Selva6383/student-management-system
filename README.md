# Student Management REST API

Spring Boot + Spring Data JPA + MySQL project implementing CRUD operations for student records.

## Architecture
```
Controller  -> handles HTTP requests/responses
Service     -> business logic
Repository  -> data access (Spring Data JPA)
Model       -> Student entity mapped to MySQL table
```

## How to run
1. Create a MySQL database (or let `createDatabaseIfNotExist=true` do it automatically).
2. Update `src/main/resources/application.properties` with your MySQL username/password.
3. Run: `mvn spring-boot:run`
4. API available at `http://localhost:8080/api/students`

## Endpoints (test these in Postman)

| Method | Endpoint              | Description          |
|--------|-----------------------|-----------------------|
| GET    | /api/students         | Get all students      |
| GET    | /api/students/{id}    | Get one student       |
| POST   | /api/students         | Create a student      |
| PUT    | /api/students/{id}    | Update a student      |
| DELETE | /api/students/{id}    | Delete a student      |

### Sample POST body
```json
{
  "name": "Arun Kumar",
  "email": "arun@example.com",
  "course": "B.Tech CSE",
  "age": 21
}
```

## Interview talking points
- **Layered architecture**: Controller → Service → Repository keeps concerns separated and code testable.
- **Spring Data JPA**: `JpaRepository<Student, Long>` auto-generates CRUD SQL — no manual queries needed.
- **Dependency Injection**: Constructor injection (`@Autowired` on constructor) used instead of field injection — easier to unit test and avoids null dependencies.
- **Validation**: `@Valid` + `@NotBlank`/`@Email` on the entity ensures bad data is rejected before hitting the database.
- **Exception handling**: `@RestControllerAdvice` centralizes error responses (e.g. 404 when a student ID doesn't exist) instead of scattering try/catch in the controller.
