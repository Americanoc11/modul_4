package com.example.cart.service;

import com.example.cart.model.Product;
import com.example.cart.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;


    @Override
    public Object findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Integer id) {
        Optional<Product> productOptional = iProductRepository.findById(id);
        return productOptional;
    }
}
