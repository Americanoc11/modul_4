package com.example.demodatabiding.controller;

import com.example.demodatabiding.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("user")
public class UserController {
    @GetMapping("/create-user")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("user", new User());
        modelAndView.addObject("gendersArray", new String[]{"Male", "Female", "Other"});
        modelAndView.addObject("hobbiesArray", new String[]{"Sport", "Shopping", "Travel"});
        modelAndView.addObject("typesArray", new String[]{"Internal", "External"});
        modelAndView.addObject("countrysArray", new String[]{"Vietnam", "Láo", "Cambodia"});
        return modelAndView;
    }

    @PostMapping("/create-user")
    public ModelAndView createUser(@ModelAttribute("user") User user) {
        ModelAndView modelAndView = new ModelAndView("/display");
        modelAndView.addObject("user", user);
        return modelAndView;
    }
}
