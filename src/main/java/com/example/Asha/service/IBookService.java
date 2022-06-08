package com.example.Asha.service;

import com.example.Asha.entity.Book;

import java.util.List;

public interface IBookService {

   public List<Book> getBooks();
   public String saveBook(Book book);

}
