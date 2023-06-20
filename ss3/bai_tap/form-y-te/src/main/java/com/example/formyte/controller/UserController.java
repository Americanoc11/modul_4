package com.example.formyte.controller;

import com.example.formyte.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("user/")
public class UserController {
    @GetMapping("")
    public String displayForm() {
        return "/display";
    }

    @RequestMapping(value = "showForm", method = RequestMethod.GET)
    public String showForm(ModelMap model) {
        model.addAttribute("user", new User());
        return "/display";
    }

    @RequestMapping(value = "/addInformation", method = RequestMethod.POST)
    public String submit(@ModelAttribute("user") User user, ModelMap modelMap) {
        modelMap.addAttribute("fullname",user.getFullname());
        modelMap.addAttribute("yearDate",user.getYearDate());
        modelMap.addAttribute("gender",user.getGender());
        modelMap.addAttribute("country",user.getCountry());
        modelMap.addAttribute("pastCode",user.getPastCode());
        modelMap.addAttribute("travel",user.getTravel());
        modelMap.addAttribute("idTravel",user.getIdTravel());
        modelMap.addAttribute("quantityTable",user.getQuantityTable());
        modelMap.addAttribute("dateStart",user.getDateStart());
        modelMap.addAttribute("dateEnd",user.getDateEnd());
        modelMap.addAttribute("describeTravel",user.getDescribeTravel());
        modelMap.addAttribute("address",user.getAddress());
        modelMap.addAttribute("phone",user.getPhone());
        modelMap.addAttribute("email",user.getEmail());
        modelMap.addAttribute("indication",user.getIndication());
        modelMap.addAttribute("historyExposure",user.getHistoryExposure());
        return "/display";
    }
}
