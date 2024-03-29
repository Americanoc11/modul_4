package com.example.appcaculator.controller;

import com.example.appcaculator.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("calculatorC")
public class CalculatorController {
    @Autowired
    private ICalculatorService iCalculatorService;

    @GetMapping("")
    public String init() {
        return "home";
    }

    @PostMapping("calculator")
    public String getOperator(@RequestParam("operator1") double operator1, @RequestParam("operator2") double operator2, @RequestParam("calculations") String calculations, Model model) {
        try {
            double result =   iCalculatorService.checkOperator(operator1, operator2, calculations);
            model.addAttribute("result", result);

        } catch (Exception e) {
            model.addAttribute("result","Can't divine zero");

        }
        model.addAttribute("operator1", operator1);
        model.addAttribute("operator2", operator2);
        return "home";
    }

}
