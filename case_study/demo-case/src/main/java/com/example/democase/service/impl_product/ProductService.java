package com.example.democase.service.impl_product;

import com.example.democase.model.Category;
import com.example.democase.model.Product;
import com.example.democase.repository.IProductRepository;
import com.example.democase.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;


}
