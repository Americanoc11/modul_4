package com.example.appcaculator.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class CalculatorService implements ICalculatorService {
    @Override
    public double checkOperator(double operator1, double operator2, String calculations, Model model) {
        double result;
        switch (calculations) {
            case "addition":
                result = operator1 + operator2;
                return result;
            case "subtraction":
                result = operator1 - operator2;
                return result;
            case "multiplication":
                result = operator1 * operator2;
                return result;
            case "division":
                if (operator2 == 0) {
                    return operator2;
                } else {
                    result = operator1 / operator2;
                    return result;
                }
        }
        return 0;
    }
}
