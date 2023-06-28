package com.example.book.service;

import com.example.book.model.Book;
import com.example.book.model.Loan;
import com.example.book.repository.ILoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class LoanService implements ILoanService {
    @Autowired
    private ILoanRepository iLoanRepository;

    @Override
    public List<Loan> findAll() {
        return iLoanRepository.findAll();
    }

    @Override
    public Loan create(Loan loan) {
        Integer code = (int) (Math.random() * (99999 - 9999) + 10000);
        LocalDate date = LocalDate.now();
        loan.setCode(code);
        loan.setDate(date);
        loan.setFlagDelete(false);
        return iLoanRepository.save(loan);
    }

    @Override
    public Loan findById(Integer id) {
        return this.iLoanRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid Id"));

    }

    @Override
    public void update(Loan loan) {
        iLoanRepository.save(loan);
    }

    @Override
    public void delete(Integer id) {
        boolean check = this.existsById(id);
        if (check) {
            iLoanRepository.deleteById(id);
        } else {
            this.findById(id);
        }
    }

    @Override
    public boolean existsById(Integer id) {
        return this.iLoanRepository.existsById(id);
    }

    @Override
    public Loan findByCode(Integer code) {
        return iLoanRepository.findByCode(code);
    }
}
