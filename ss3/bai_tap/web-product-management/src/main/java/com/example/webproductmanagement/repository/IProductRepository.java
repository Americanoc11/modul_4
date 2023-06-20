package com.example.webproductmanagement.repository;

import com.example.webproductmanagement.model.Product;
import org.springframework.ui.ModelMap;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void create(Product product);

    Product findById(int id);

    void update(Product product);

    void delete(int id);
}
