package com.example.product_management.controller;

import com.example.product_management.model.Product;
import com.example.product_management.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping("")
    public String showList(Model model) {
        List<Product> productList = iProductService.findAll();
        model.addAttribute("product", new Product());
        model.addAttribute("productList", productList);
        return "product/list";
    }

    @PostMapping("/create")
    public String createProduct(@ModelAttribute("product") Product product) {
        iProductService.create(product);
        return "redirect:/product";
    }

    @PostMapping("/delete")
    public String deleteRecord(@RequestParam("id") Integer id) {
        iProductService.delete(id);
        return "redirect:/product";
    }

    @GetMapping("/update/{id}")
    public String showFormEdit(@PathVariable("id") int id, Model model) {
        Product product = iProductService.findOne(id);
        model.addAttribute("product", product);
        return "/product/edit";
    }

    @PostMapping("/update")
    public String updateProduct(@ModelAttribute("product") Product product) {
        iProductService.update(product);
        return "redirect:/product";
    }
}
