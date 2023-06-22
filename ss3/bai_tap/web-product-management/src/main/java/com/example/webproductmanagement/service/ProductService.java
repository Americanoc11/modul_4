package com.example.webproductmanagement.service;

import com.example.webproductmanagement.model.Product;
import com.example.webproductmanagement.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public void create(Product product) {
        iProductRepository.create(product);
    }

    @Override
    public Product findById(int id) {
        return iProductRepository.findById(id);
    }

    @Override
    public void update(Product product) {
        iProductRepository.update(product);
    }

    @Override
    public void delete(int id) {
        iProductRepository.delete(id);
    }

    @Override
    public boolean checkProduct(Product product) {
        return iProductRepository.checkProduct(product);
    }

    @Override
    public boolean findProductById(int id) {
        return iProductRepository.findProductById(id);
    }

}
