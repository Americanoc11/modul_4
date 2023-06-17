package com.example.appcaculator.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class CalculatorService implements ICalculatorService {
    @Override
    public String checkOperator(double operator1, double operator2, String calculations, Model model) {
        double result;
        switch (calculations) {
            case "addition":
                result = operator1 + operator2;
                model.addAttribute("operator1", operator1);
                model.addAttribute("operator2", operator2);
                model.addAttribute("result", result);
                break;
            case "subtraction":
                result = operator1 - operator2;
                model.addAttribute("operator1", operator1);
                model.addAttribute("operator2", operator2);
                model.addAttribute("result", result);
                break;
            case "multiplication":
                result = operator1 * operator2;
                model.addAttribute("operator1", operator1);
                model.addAttribute("operator2", operator2);
                model.addAttribute("result", result);
                break;
            case "division":
                if (operator2 == 0) {
                    model.addAttribute("operator1", operator1);
                    model.addAttribute("operator2", operator2);
                    model.addAttribute("result", "Can't division zero");

                } else {
                    result = operator1 / operator2;
                    model.addAttribute("operator1", operator1);
                    model.addAttribute("operator2", operator2);
                    model.addAttribute("result", result);
                }
                break;
        }
        return null;
    }
}
