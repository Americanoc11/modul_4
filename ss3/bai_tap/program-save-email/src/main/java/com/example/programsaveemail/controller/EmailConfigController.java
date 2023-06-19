package com.example.programsaveemail.controller;

import com.example.programsaveemail.model.EmailConfig;
import com.example.programsaveemail.service.IEmailConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("email")
public class EmailConfigController {
    @Autowired
    private IEmailConfigService iEmailConfigService;

//    @GetMapping("")
//    public String getEmailConfig(Model model) {
//        List<EmailConfig> emailConfigs = iEmailConfigService.findAll();
//        model.addAttribute("emailConfigs", emailConfigs);
//        return "email-config";
//    }

    @PostMapping("/email-config")
    public String saveEmailConfig(@ModelAttribute EmailConfig emailConfig) {
        iEmailConfigService.save(emailConfig);
        return "redirect:/email/display";
    }
    @GetMapping("display")
    public ModelAndView display(){
        ModelAndView modelAndView= new ModelAndView("email-config");
        List<EmailConfig> emailConfigs = iEmailConfigService.findAll();
        modelAndView.addObject("emailConfigs",emailConfigs);
        return modelAndView;
    }
}
