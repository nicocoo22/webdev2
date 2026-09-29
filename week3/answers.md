# WEBDEV2 Lab 4 — Server-Rendered CRUD Interface

## Task 1 — Book List Template

Created books.html using Thymeleaf's th:each attribute to iterate through and display the list of books. Used th:text to output each book title dynamically, and included a th:if condition to show an empty-state message whenever the list contains no books.

## Task 2 — Book Detail Template

Created book-detail.html mapped to GET /books/{id}. Used Thymeleaf variable expressions (${...}) to render the selected book's ID, title, and author.
## Task 3 — Shared Navigation Fragment

CCreated fragments/navbar.html containing a reusable navbar fragment. Embedded this fragment into both books.html and book-detail.html using th:replace to maintain a consistent navigation layout.

## Task 4 — Create Form

Created book-form.html and bound it to a Book model object using th:object. Applied th:field on the title and author input fields to automatically handle input mapping. Configured the form to submit to POST /books, which processes the creation and redirects the user back to /books.
## Task 5 — Binding Errors

Updated the POST /books controller handler to accept @Valid @ModelAttribute Book book paired directly with a BindingResult result parameter. If validation fails, the controller re-renders the book-form view instead of executing the save operation. Integrated th:errors in the template to display field-specific validation error messages for the title and author inputs.
