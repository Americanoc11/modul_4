package com.example.book.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String name;
    private String author;
    @Column(columnDefinition = "LONGTEXT")
    private String description;
    private int quantity;
    @OneToMany(mappedBy = "book")
    private List<Loan> loan;
    @Column(name = "is_delete")
    private boolean isFlagDelete;

    public Book() {
    }

    public Book(Integer id, String name, String author, String description, int quantity, List<Loan> loan, boolean isFlagDelete) {
        Id = id;
        this.name = name;
        this.author = author;
        this.description = description;
        this.quantity = quantity;
        this.loan = loan;
        this.isFlagDelete = isFlagDelete;
    }

    public Book(String name, String author, String description, int quantity, List<Loan> loan, boolean isFlagDelete) {
        this.name = name;
        this.author = author;
        this.description = description;
        this.quantity = quantity;
        this.loan = loan;
        this.isFlagDelete = isFlagDelete;
    }

    public List<Loan> getLoan() {
        return loan;
    }

    public void setLoan(List<Loan> loan) {
        this.loan = loan;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public boolean isFlagDelete() {
        return isFlagDelete;
    }

    public void setFlagDelete(boolean flagDelete) {
        isFlagDelete = flagDelete;
    }
}
