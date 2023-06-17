package com.example.dictionary.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class DictionaryService implements IDictionaryService{
    @Override
    public void search(String name, Model model) {
        String result;
        switch (name) {
            case "1":
                result = "một";
                model.addAttribute("result", result);
                break;
            case "one":
                result = "một";
                model.addAttribute("result", result);
                break;
            case "2":
                result = "hai";
                model.addAttribute("result", result);
                break;
            case "two":
                result = "hai";
                model.addAttribute("result", result);
                break;
            case "3":
                result = "ba";
                model.addAttribute("result", result);
                break;
            case "three":
                result = "ba";
                model.addAttribute("result", result);
                break;
            case "4":
                result = "bốn";
                model.addAttribute("result", result);
                break;
            case "four":
                result = "bốn";
                model.addAttribute("result", result);
                break;
            case "5":
                result = "năm";
                model.addAttribute("result", result);
                break;
            case "five":
                result = "năm";
                model.addAttribute("result", result);
                break;
            default:
                model.addAttribute("result", "Không tìm thấy");
        }
    }
}
