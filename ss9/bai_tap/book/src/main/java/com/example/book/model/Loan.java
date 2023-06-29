package com.example.book.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "loans")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer code;
    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDate date;
    @Column(name = "is_delete")
    private boolean isFlagDelete;


    public Loan() {
    }

    public Loan(Integer id, Integer code, Book book, LocalDate date, boolean isFlagDelete) {
        this.id = id;
        this.code = code;
        this.book = book;
        this.date = date;
        this.isFlagDelete = isFlagDelete;
    }

    public Loan(Integer code, Book book, LocalDate date, boolean isFlagDelete) {
        this.code = code;
        this.book = book;
        this.date = date;
        this.isFlagDelete = isFlagDelete;
    }

    public boolean isFlagDelete() {
        return isFlagDelete;
    }

    public void setFlagDelete(boolean flagDelete) {
        isFlagDelete = flagDelete;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
