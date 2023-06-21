package com.example.product_management.model;

import javax.persistence.*;

@Entity
public class Product implements Cloneable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String describes;
    private double price;

    public Product() {
    }

    public Product(int id, String name, String describes, double price) {
        this.id = id;
        this.name = name;
        this.describes = describes;
        this.price = price;
    }

    public Product(String name, String describes, double price) {
        this.name = name;
        this.describes = describes;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
