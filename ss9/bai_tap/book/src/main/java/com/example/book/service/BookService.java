package com.example.book.service;

import com.example.book.model.Book;
import com.example.book.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {
    @Autowired
    private IBookRepository iBookRepository;

    @Override
    public List<Book> findAll() {
        return iBookRepository.findAll();
    }

    @Override
    public Book create(Book book) {
        book.setFlagDelete(false);
        return iBookRepository.save(book);
    }

    @Override
    public Book findById(Integer id) {
        return this.iBookRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid Id"));
    }

    @Override
    public void update(Book book) {
        iBookRepository.save(book);
    }

    @Override
    public void delete(Integer id) {
        boolean check = this.existsById(id);
        if (check) {
            Book book = this.findById(id);
            book.setFlagDelete(true);
            iBookRepository.save(book);
        }
    }

    @Override
    public boolean existsById(Integer id) {
        return this.iBookRepository.existsById(id);
    }

    @Override
    public void borrow(Integer id) {
        Book book = this.findById(id);
            book.setQuantity(book.getQuantity() - 1);
            iBookRepository.save(book);
    }
}
