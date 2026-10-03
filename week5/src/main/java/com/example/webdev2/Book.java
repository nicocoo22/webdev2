package com.example.webdev2;

import jakarta.validation.constraints.*;

public class Book {

    private Long id;

    @NotBlank(message = "Title is required")
    @Size(min = 2, max = 100, message = "Title must be between 2 and 100 characters")
    private String title;

    @NotBlank(message = "Author is required")
    private String author;

    @NotNull(message = "Publication year is required")
    @Min(value = 1000, message = "Year must be no earlier than 1000")
    @Max(value = 2026, message = "Year cannot be in the future")
    private Integer year;

    @NotBlank(message = "ISBN is required")
    @Pattern(regexp = "^(null|\\d{10}|\\d{13})$", message = "ISBN must be either 10 or 13 digits")
    private String isbn;

    public Book() {}

    public Book(Long id, String title, String author, Integer year, String isbn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public Integer getYear() { return year; }
    public void setYear(Integer year) { this.year = year; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
}