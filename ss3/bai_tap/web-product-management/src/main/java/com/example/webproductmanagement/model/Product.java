package com.example.webproductmanagement.model;

public class Product {
    private int id;
    private String name;
    private String describe;
    private double price;

    public Product(int id, String name, String describe, double price) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.price = price;
    }

    public Product(String name, String describe, double price) {
        this.name = name;
        this.describe = describe;
        this.price = price;
    }

    public Product() {
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

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", describe='" + describe + '\'' +
                ", price=" + price +
                '}';
    }
}
