# ExpenseTrackerApi
├── main/
│   ├── java/
│   │   └── com/
│   │       └── expense_tracker/
│   │           ├── config/
│   │           │   ├── SecurityConfig.java       # Spring Security configuration
│   │           │   ├── JwtAuthenticationFilter.java # JWT filter for request validation
│   │           │   └── SwaggerConfig.java        # Swagger/OpenAPI configuration
│   │           │
│   │           ├── controller/
│   │           │   ├── AuthController.java       # Handles sign-up and login
│   │           │   └── ExpenseController.java    # Handles expense-related APIs
│   │           │
│   │           ├── dto/
│   │           │   ├── AuthRequest.java          # DTO for login/signup requests
│   │           │   ├── AuthResponse.java         # DTO for login responses (JWT)
│   │           │   ├── ExpenseRequest.java       # DTO for adding/updating expenses
│   │           │   └── ExpenseResponse.java      # DTO for returning expense data
│   │           │
│   │           ├── entity/
│   │           │   ├── User.java                 # User entity
│   │           │   └── Expense.java              # Expense entity
│   │           │
│   │           ├── exception/
│   │           │   ├── GlobalExceptionHandler.java # Centralized exception handling
│   │           │   └── ResourceNotFoundException.java # Custom exceptions
│   │           │
│   │           ├── repository/
│   │           │   ├── UserRepository.java       # User database operations
│   │           │   └── ExpenseRepository.java    # Expense database operations
│   │           │
│   │           ├── security/
│   │           │   ├── JwtUtil.java              # JWT generation/validation helper
│   │           │   └── UserDetailsServiceImpl.java # Custom user details for Spring Security
│   │           │
│   │           ├── service/
│   │           │   ├── AuthService.java          # Business logic for authentication
│   │           │   └── ExpenseService.java       # Business logic for expenses
│   │           │
│   │           ├── util/
│   │           │   ├── DateUtil.java             # Helper for date formatting/filtering
│   │           │   └── ValidationUtil.java       # Helper for request validation
│   │           │
│   │           ├── ExpenseTrackerApplication.java # Main Spring Boot Application
│   │
│   ├── resources/
│   │   ├── application.properties                # Main configuration file
│   │   ├── static/                               # Static files (if any)
│   │   └── templates/                            # Templates (if using Thymeleaf)
│   │
│   └── test/
│       ├── java/
│           └── com/
│               └── expense_tracker/
│                   ├── AuthControllerTest.java    # Unit tests for authentication
│                   └── ExpenseControllerTest.java # Unit tests for expense APIs



Now i have this spring boot project with this layers:

Layer Details
1. config/
   Centralized configurations for:
   Security (e.g., JWT filters and access control).
   API documentation (Swagger/OpenAPI).
   Application-specific setup (e.g., CORS, password encoding).
2. controller/
   Responsible for handling incoming HTTP requests and returning appropriate responses.
   Delegate business logic to services.
   Use DTOs to ensure strict control over request/response formats.
3. dto/ (Data Transfer Objects)
   Encapsulate data between the client and the server.
   Helps in maintaining a clean separation between API models and database entities.
4. entity/
   Represents database tables with JPA/Hibernate annotations.
   Contains mappings for relationships like @OneToMany (User-Expense).
5. exception/
   Centralized exception handling using @ControllerAdvice for consistent error responses.
   Custom exceptions like ResourceNotFoundException or InvalidRequestException.
6. repository/
   Interfaces extending JpaRepository or CrudRepository for database operations.
   Example:
   java
   Copy code
   public interface UserRepository extends JpaRepository<User, UUID> {
   Optional<User> findByEmail(String email);
   }
7. security/
   Contains everything related to authentication and authorization:
   JWT token generation and validation.
   Custom UserDetailsService to integrate with Spring Security.
8. service/
   Contains the business logic.
   Examples:
   AuthService: Handles user registration, login, and JWT creation.
   ExpenseService: Handles CRUD operations for expenses and filtering logic.
9. util/
   Helper classes for reusable logic:
   DateUtil: Handle date formatting, parsing, and filtering.
   ValidationUtil: Centralize validations for input data.


Can you give me the code implementation for every file with the most updated methods and best practices