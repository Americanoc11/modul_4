package com.example.programsaveemail.controller;

import com.example.programsaveemail.model.EmailConfig;
import com.example.programsaveemail.service.IEmailConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmailConfigController {
    @Autowired
    private IEmailConfigService iEmailConfigService;

    @GetMapping("/email-config")
    public String getEmailConfig(Model model, @ModelAttribute("emailConfig") EmailConfig emailConfig) {
        List<EmailConfig> emailConfigs = iEmailConfigService.findAll();
        model.addAttribute("emailConfigs", emailConfigs);
        return "email-config";
    }

    @PostMapping("/email-config")
    public String saveEmailConfig(@ModelAttribute EmailConfig emailConfig) {
        iEmailConfigService.save(emailConfig);
        return "redirect:/email-config";
    }

    @GetMapping("/details")
    public String details(@RequestParam("id") long id, Model model, @ModelAttribute("email") EmailConfig emailConfig) {
        model.addAttribute("email", iEmailConfigService.findById(id));
        return "details";
    }

    @PostMapping("/update")
    public String updateForm(@ModelAttribute("email") EmailConfig emailConfig) {
        iEmailConfigService.update(emailConfig);
        return "redirect:/email-config";
    }

}
