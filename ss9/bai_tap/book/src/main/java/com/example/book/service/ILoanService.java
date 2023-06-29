package com.example.book.service;

import com.example.book.model.Book;
import com.example.book.model.Loan;

import java.util.List;

public interface ILoanService {
    List<Loan> findAll();

    Loan create(Loan loan);

    Loan findById(Integer id);
    void update(Loan loan);
    void delete(Integer id);

    boolean existsById(Integer id);

    Loan findByCode(Integer code);

}
