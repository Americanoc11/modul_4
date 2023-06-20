package com.example.demothymeleaf.service;

import com.example.demothymeleaf.model.Customer;
import org.springframework.ui.Model;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void create(String name, Model model);
}
