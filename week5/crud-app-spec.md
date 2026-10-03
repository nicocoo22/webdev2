# Book Library CRUD Application

## Project Description

The Book Library CRUD Application is a web-based catalog management system designed to manage a Harry Potter book library. It allows users to browse the catalog, register new books, update existing records, and remove books from storage. Built using Spring Boot, Thymeleaf, Jakarta Bean Validation, and standard Controller-Service-Repository architecture, the system enforces clean data validation and separation of concerns.

## Functional Requirements

* REQ-1: The system shall allow users to create a new book entry containing a valid title, author, publication year (1000–2026), and standard ISBN.
* REQ-2: The system shall display a list of all stored books in a formatted table showing ID, Title, Author, Publication Year, and ISBN.
* REQ-3: The system shall allow users to edit the title, author, publication year, and ISBN of an existing book using a pre-populated form.
* REQ-4: The system shall allow users to delete an existing book from the catalog after confirmation.
* REQ-5: The system shall validate all submitted form fields against defined Bean Validation constraints and render inline error messages when invalid data is provided.