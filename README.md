# Development Standards

## Branch Naming Convention
All branch names must be in English and follow these formats:

- **Bug fixes:** `fix/descriptiveBugName`
- **New features:** `feature/descriptiveFeatureName`

### Examples:
- `fix/fix-login-authentication`
- `feature/add-user-registration`

## Commit Message Convention
Each commit message should be clear, concise, and structured as follows:

```
[type]: [Short description]

[Optional detailed description]
```

### Commit Types:
- **feat:** A new feature
- **fix:** A bug fix
- **docs:** Documentation changes
- **style:** Code formatting (no logic changes)
- **refactor:** Code restructuring without changing functionality
- **test:** Adding or modifying tests
- **chore:** Routine maintenance tasks (e.g., package updates)

### Examples:
```
feat: implement user authentication

Added JWT authentication for user login and registration.
```
```
fix: resolve crash on profile page

Fixed a null pointer exception when loading user avatars.
```

## API Endpoint Naming Convention
- Use **lowercase**, **hyphens (-)** to separate words.
- Use **plural** nouns for resource names.
- Use **RESTful principles**.
- Actions should be defined by HTTP methods:
  - **GET**: Retrieve data
  - **POST**: Create a resource
  - **PUT/PATCH**: Update a resource
  - **DELETE**: Remove a resource

### Examples:
| HTTP Method | Endpoint                     | Description |
|------------|-----------------------------|-------------|
| GET        | `/users`                     | Get all users |
| GET        | `/users/{id}`                | Get a user by ID |
| POST       | `/users`                     | Create a new user |
| POST       | `/users-resgistrated`        | Get all users registrated |
| PUT        | `/users/{id}`                | Update a user completely |
| PATCH      | `/users/{id}`                | Partially update a user |
| DELETE     | `/users/{id}`                | Delete a user |

# Project Naming Conventions and Best Practices

This document outlines the recommended naming conventions and best practices for structuring the project.

## 📂 Folder & Package Structure

- **Use lowercase names for packages** (following Java conventions).
- **Follow a clear modular structure**:

  ```
  src/main/java/aivp.backend_volunteers
  
  ├── repositories          # Data access layer (Spring Data JPA repositories)
  │   └── ExampleRepository # Repository interface
  ├── services              # Business logic layer
  │   ├── dtos              # Data Transfer Objects (DTOs)
  │   │   ├── request       # DTOs for request payloads
  │   │   │   └── ExampleRequestDto
  │   │   └── response      # DTOs for response payloads
  │   │       └── ExampleResponseDto
  │   ├── implementations   # Implementation of service interfaces 
  │   │   └── ExampleServiceImpl # Service implementation
  │   └── ExampleService    # Service interface 
  ├── BackendApplication   # Main application entry point
  
  src/main/resources
  ├── application.properties  # Configuration file
  ```

## ✅ Class and Interface Naming Conventions

| Type          | Naming Convention | Example |
|--------------|------------------|---------|
| Classes      | PascalCase        | `ExampleEntity`, `ExampleController` |
| Interfaces   | PascalCase (No `I` prefix) | `ExampleService` (instead of `IExampleService`) |
| DTOs         | PascalCase + Suffix `Dto` | `ExampleRequestDto`, `ExampleResponseDto` |
| Implementations | `ClassNameImpl` | `ExampleServiceImpl` |
| Repositories | PascalCase + Suffix `Repository` | `ExampleRepository` |
| Configurations | PascalCase | `ExampleSecurity` |

## 🚀 Best Practices

- **Keep folder names lowercase** to align with Java package naming conventions.
- **Separate DTOs into `request` and `response` packages** for clarity.
- **Avoid the `I` prefix for interfaces** (common in C#, but not Java best practice).
- **Use descriptive package names** (e.g., `database` instead of `db`, `implementations` instead of `impl`).
- **Group related files** (e.g., security-related classes inside `config`).

By following these conventions, the project structure remains **clean, scalable, and aligned with Java best practices**. 🚀



