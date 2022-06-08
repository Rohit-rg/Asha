package com.example.Asha.service.impl;

import com.example.Asha.repository.BookRepository;
import com.example.Asha.entity.Book;
import com.example.Asha.repository.BookRepository;
import com.example.Asha.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {
     @Autowired
     private BookRepository bookdao;
    @Override
    public List<Book> getBooks() {
        return bookdao.findAll();

    }
}
