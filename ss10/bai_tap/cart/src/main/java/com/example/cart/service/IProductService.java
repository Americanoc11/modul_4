package com.example.cart.service;

import com.example.cart.model.Product;

import java.util.Optional;

public interface IProductService {


    Object findAll();

    Optional<Product> findById(Integer id);
}
