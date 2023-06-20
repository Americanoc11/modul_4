package com.example.demothymeleaf.controller;

import com.example.demothymeleaf.model.Customer;
import com.example.demothymeleaf.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("")
    public String showList(Model model) {
        List<Customer> customerList = iCustomerService.findAll();
        model.addAttribute("customerList", customerList);
        return "home";
    }

    @GetMapping("create")
    public String showNewForm() {
        return "create";
    }

    @PostMapping("create")
    public String saveCustomer(@RequestParam("name") String name, Model model) {
        iCustomerService.create(name,model);

        return "redirect:home.html";
    }
}
