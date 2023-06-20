package com.example.demomodelattribule.controller;

import com.example.demomodelattribule.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @GetMapping("")
    public String init() {
        return "/demo";
    }

    @ModelAttribute("user")
    public User user() {
        return new User();
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute("user") User user, ModelMap modelMap) {
        modelMap.addAttribute("id", user.getId());
        modelMap.addAttribute("name", user.getName());
        return "/view";
    }
}
