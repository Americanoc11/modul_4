package com.example.change_money;

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
    @GetMapping("")
    public String init(HttpServletRequest request) {
        return "form-rate-money";
    }

    @PostMapping("/change")
    public String changeMoney(@RequestParam int usd, Model model) {
        int vnd=23000;
        int result=usd*vnd;
        model.addAttribute("result",result);
        return "/form-rate-money";
    }
}
