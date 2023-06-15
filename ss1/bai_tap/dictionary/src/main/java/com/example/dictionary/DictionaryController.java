package com.example.dictionary;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/dictionary")
public class DictionaryController {
    @GetMapping("")
    public String init() {
        return "form";
    }

    @PostMapping("/search")
    public String search(@RequestParam String name, Model model) {
        String result;
        switch (name) {
            case "1":
                 result="một";
                model.addAttribute("result", result);
                break;
            case "one":
                result="một";
                model.addAttribute("result", result);
                break;
            case "2":
                result="hai";
                model.addAttribute("result", result);
                break;
            case "two":
                result="hai";
                model.addAttribute("result", result);
                break;
            case "3":
                result="ba";
                model.addAttribute("result", result);
                break;
            case "three":
                result="ba";
                model.addAttribute("result", result);
                break;
            case "4":
                result="bốn";
                model.addAttribute("result", result);
                break;
            case "four":
                result="bốn";
                model.addAttribute("result", result);
                break;
            case "5":
                result="năm";
                model.addAttribute("result", result);
                break;
            case "five":
                result="năm";
                model.addAttribute("result", result);
                break;
            default:
                model.addAttribute("result", "Không tìm thấy");
        }
        return "form";
    }

}
