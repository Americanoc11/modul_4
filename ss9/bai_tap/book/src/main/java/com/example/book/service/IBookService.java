package com.example.book.service;

import com.example.book.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();

    Book create(Book book);

    Book findById(Integer id);
    void update(Book book);
    void delete(Integer id);

    boolean existsById(Integer id);

    void borrow(Integer id);
}
