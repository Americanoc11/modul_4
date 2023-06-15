package com.example.demothuchanh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping()
    public String init() {
        return "form";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }
}
