package com.example.blog_app.controller;

import com.example.blog_app.model.Category;
import com.example.blog_app.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("")
    public String showList(Model model) {
        List<Category> categoryList = iCategoryService.findAll();
        model.addAttribute("category", new Category());
        model.addAttribute("categoryList", categoryList);
        return "/blog/categories/list";
    }

    @PostMapping("/create")
    public String createCategory(@ModelAttribute("category") Category category, Model model) {
        iCategoryService.save(category);
        return "redirect:/categories";
    }

    @GetMapping("/update/{id}")
    public String showFormEdit(@PathVariable("id") Integer id, Model model, RedirectAttributes redirectAttributes) {
        if (iCategoryService.exitsById(id)) {
            model.addAttribute("category", iCategoryService.findById(id));
            return "/blog/categories/edit";
        } else {
            redirectAttributes.addFlashAttribute("invalidIDMessage", "Invalid ID!");
            return "redirect:/categories";
        }
    }

    @PostMapping("/update")
    public String updateCategory(@ModelAttribute("category") Category category) {
        iCategoryService.update(category);
        return "redirect:/categories";
    }

    @PostMapping("/delete")
    public String deleteCategory(@RequestParam("id") Integer id,RedirectAttributes redirectAttributes) {
        boolean check = iCategoryService.exitsById(id);
        if (check){
            iCategoryService.deleted(id);
        }else {
            redirectAttributes.addFlashAttribute("invalidIDMessage","Invalid ID");
        }
        return "redirect:/categories";
    }
}
