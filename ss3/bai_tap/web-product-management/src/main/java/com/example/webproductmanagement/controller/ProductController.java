package com.example.webproductmanagement.controller;

import com.example.webproductmanagement.model.Product;
import com.example.webproductmanagement.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("product/")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping("")
    public String showList(Model model) {
        List<Product> productList = iProductService.findAll();
        model.addAttribute("product", new Product());
        model.addAttribute("productList", productList);
        return "/product/index";
    }

    @PostMapping("/create")
    public String createProduct(@ModelAttribute("product") Product product) {
        iProductService.create(product);
        return "redirect:/product/";
    }

    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable int id, Model model) {
        Product product = iProductService.findById(id);
        model.addAttribute("product", product);
        return "/product/edit";
    }

    @PostMapping("/edit")
    public String updateProduct(@ModelAttribute("product") Product product) {
        iProductService.update(product);
        return "redirect:/product/";
    }

    @PostMapping("/delete")
    public String deleteProducr(@RequestParam("id") int id, Model model) {
        iProductService.delete(id);
        return "redirect:/product/";
    }
}
