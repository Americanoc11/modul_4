package com.example.form_user_validate.controller;

import com.example.form_user_validate.dto.UserDTO;
import com.example.form_user_validate.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("users")
public class UserController {
    @GetMapping("")
    public String showForm(Model model) {
        model.addAttribute("user", new UserDTO());
        return "form";
    }

    @PostMapping("/create")
    public String createUser(@Valid @ModelAttribute("user") UserDTO userDTO, BindingResult bindingResult
            , Model model) {
      if (bindingResult.hasErrors()){
          model.addAttribute("user",userDTO);
          return "/form";
      }
        User userEntity = new User();
        BeanUtils.copyProperties(userDTO,userEntity);
        model.addAttribute("msg1","true");
        return "/home";
    }

}
