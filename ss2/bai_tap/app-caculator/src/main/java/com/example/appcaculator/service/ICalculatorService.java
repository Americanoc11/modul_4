package com.example.appcaculator.service;

import org.springframework.ui.Model;

public interface ICalculatorService {
    double checkOperator(double operator1, double operator2, String calculations, Model model);
}
