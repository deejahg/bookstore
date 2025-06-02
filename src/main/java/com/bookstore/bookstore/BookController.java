package com.bookstore.bookstore;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private List<String> books = new ArrayList<>(List.of("Java", "Spring", "Docker"));

    @GetMapping
    public List<String> getAllBooks() {
        return books;
    }

    @PostMapping
    public String addBook(@RequestBody String book) {
        books.add(book);
        return "Book added: " + book;
    }
}
