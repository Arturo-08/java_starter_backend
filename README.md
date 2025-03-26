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



