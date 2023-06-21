package com.example.demoorm.service;

import com.example.demoorm.model.Product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    private static final String SELECT_ALL = "FROM Product";


    @Override
    public List<Product> getProduct() {
        return ConnectionUtils.getEntityManager().createQuery(SELECT_ALL).getResultList();
    }

}
