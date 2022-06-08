package com.example.Asha.controller;

import com.example.Asha.entity.Book;
import com.example.Asha.service.impl.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    List<Book> getbook() {
           return bookService.getBooks();
    }
}