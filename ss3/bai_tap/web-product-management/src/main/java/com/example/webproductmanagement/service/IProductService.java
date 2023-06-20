package com.example.webproductmanagement.service;

import com.example.webproductmanagement.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void create(Product product);

    Product findById(int id);

    void update(Product product);

    void delete(int id);
}
