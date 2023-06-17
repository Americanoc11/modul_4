package com.example.dictionary.controller;

import com.example.dictionary.service.DictionaryService;
import com.example.dictionary.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/dictionary")
public class DictionaryController {
    @Autowired
    private IDictionaryService iDictionaryService ;
    @GetMapping("")
    public String init() {
        return "form";
    }

    @PostMapping("/search")
    public String search(@RequestParam String name, Model model) {
        iDictionaryService.search(name,model);
        return "form";
    }

}
