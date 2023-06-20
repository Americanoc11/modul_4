package com.example.demothymeleaf.service;

import com.example.demothymeleaf.model.Customer;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    private static List<Customer> customerList;

    static {
        customerList = new ArrayList<>();
        customerList.add(new Customer(1, "Duc"));
        customerList.add(new Customer(2, "Vu"));
        customerList.add(new Customer(3, "Nhan"));
        customerList.add(new Customer(4, "Sang"));
        customerList.add(new Customer(5, "Hai"));
    }

    @Override
    public List<Customer> findAll() {
        return customerList;
    }

    @Override
    public void create(String name, Model model) {
        Customer customer = new Customer();
        customer.setId(customerList.size() + 1);
        customer.setName(name);
        customerList.add(customer);
    }
}
