package com.example.change_money.controller;

import com.example.change_money.service.IRateMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class RateMoneyController {
    @Autowired
    private IRateMoneyService iRateMoneyService;

    @GetMapping("")
    public String init(HttpServletRequest request) {
        return "form-rate-money";
    }

    @PostMapping("/change")
    public String changeMoney(@RequestParam("usd") int usd, Model model) {
        int result = iRateMoneyService.change(usd);
        if (result != 0) {
            model.addAttribute("result", result);
        } else {
            model.addAttribute("result", "Số nhập không được âm,xin nhập lại");
        }
        return "/form-rate-money";
    }
}
