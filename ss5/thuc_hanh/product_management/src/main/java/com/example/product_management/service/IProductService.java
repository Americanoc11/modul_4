package com.example.product_management.service;

import com.example.product_management.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void create(Product product);

    void delete(Integer id);

    Product findOne(Integer id);

    void update(Product product);
}
