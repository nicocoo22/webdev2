# WEBDEV2 Lab 5 — Custom Domain Simple CRUD Application

## Task 1 — Domain Selection & Requirements

The selected domain is a Book Library Management System for managing a Harry Potter book catalog. The application supports creating, viewing, editing, and deleting book records. The functional requirements are documented in crud-app-spec.md at the repository root.

## Task 2 — Validated Domain Model

The Book entity contains five fields: id, title, author, year, and isbn. Jakarta Bean Validation is used with constraints including @NotBlank, @Size, @Min, and @Max. Each constraint includes a custom, descriptive validation error message.

## Task 3 — Service & Repository Layers

The application strictly adheres to the Controller-Service-Repository architecture:

BookRepository: Manages in-memory storage using an internal collection, providing methods to save, find by ID (returning Optional<Book>), retrieve all items, and delete by ID.

BookService: Encapsulates business logic, handles Optional unwrapping, and delegates persistence operations directly to BookRepository.

## Task 4 — Web Controller & Thymeleaf CRUD Views

BookController handles web routes for the complete CRUD lifecycle. Thymeleaf templates provide the user interface:

books.html: Formatted table displaying all books (ID, Title, Author, Year, ISBN) with action links to Edit or Delete.

book-form.html: A single, unified form template that handles both book creation and editing. It uses th:object and th:field for binding, checking BindingResult to display inline validation messages via th:errors.

## CRUD Operations

* Create: GET /books/new (renders form) & POST /books/save
* Read: GET /books 
* Update: GET /books/edit/{id}  & POST /books/save
* Delete: GET /books/delete/{id}
## Validation

Invalid or incomplete form submissions are intercepted by Spring's BindingResult. If errors exist, the user is returned to book-form.html where field-specific error messages are rendered inline directly beside the corresponding input fields.