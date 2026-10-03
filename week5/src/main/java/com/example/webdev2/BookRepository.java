package com.example.webdev2;

import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class BookRepository {

    private final Map<Long, Book> storage = new HashMap<>();
    private long currentId = 1;

    public BookRepository() {
        save(new Book(null, "Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997, "9780747532699"));
        save(new Book(null, "Harry Potter and the Chamber of Secrets", "J.K. Rowling", 1998, "9780747538493"));
        save(new Book(null, "Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", 1999, "9780747546290"));
        save(new Book(null, "Harry Potter and the Goblet of Fire", "J.K. Rowling", 2000, "9780747546245"));
    }

    public List<Book> findAll() {
        return new ArrayList<>(storage.values());
    }

    public Optional<Book> findById(Long id) {
        return Optional.ofNullable(storage.get(id));
    }

    public Book save(Book book) {
        if (book.getId() == null) {
            book.setId(currentId++);
        }
        storage.put(book.getId(), book);
        return book;
    }

    public void deleteById(Long id) {
        storage.remove(id);
    }
}