package com.example.demo2.controller;

import com.example.demo2.model.User;
import com.example.demo2.service.IUserService;
import com.example.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService = new UserService();

    @GetMapping("")
    public String showList(HttpServletRequest request){
        List<User> userList= iUserService.getAll();
        request.setAttribute("userList",userList);
        return "/list";
    }
}
