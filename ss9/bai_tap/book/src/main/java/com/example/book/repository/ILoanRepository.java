package com.example.book.repository;

import com.example.book.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ILoanRepository extends JpaRepository<Loan, Integer> {
    Loan findByCode(Integer code);
}
