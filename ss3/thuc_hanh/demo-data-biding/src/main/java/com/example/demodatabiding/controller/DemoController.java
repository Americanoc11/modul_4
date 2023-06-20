package com.example.demodatabiding.controller;

import com.example.demodatabiding.model.Customer;
import com.example.demodatabiding.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DemoController {
    @GetMapping("customer")
    public Customer customer() {
        return new Customer();
    }

    @GetMapping("demo")
    public ModelAndView demo() {
        ModelAndView modelAndView = new ModelAndView("/demo");
        String name = "Codegym";
        modelAndView.addObject("name", name);
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(1, "Duc"));
        customerList.add(new Customer(2, "Danh"));
        modelAndView.addObject("customerList", customerList);
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }
}
