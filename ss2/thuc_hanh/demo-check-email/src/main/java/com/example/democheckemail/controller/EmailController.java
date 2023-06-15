package com.example.democheckemail.controller;

import com.example.democheckemail.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {
    @Autowired
    private IEmailService iEmailService;

    @GetMapping()
    public String init() {
        return "create";
    }

    @PostMapping("/create")
    public String checkEmail(@RequestParam("email") String email, Model model) {
        boolean check = iEmailService.checkEmail(email);
        if (check) {
            model.addAttribute("result", "ok");
        } else {
            model.addAttribute("result", "Email invalid email, please input agian");
        }
        return "create";
    }
}
