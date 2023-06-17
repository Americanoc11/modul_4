package com.example.appspicesandwich.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
@RequestMapping("")
public class SandwichController {
    @GetMapping()
    public String init() {
        return "form-create";
    }

    @PostMapping("/create")
    public String save(@RequestParam("spice") String[] spice, Model model) {
        System.out.println(Arrays.toString(spice));
        model.addAttribute("result", Arrays.toString(spice));
        return "form-create";
    }
}
