package com.example.blog_app.controller;

import com.example.blog_app.model.Blog;
import com.example.blog_app.model.Category;
import com.example.blog_app.service.IBlogService;
import com.example.blog_app.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("blog")
public class BlogController {
    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private ICategoryService iCategoryService;


    @GetMapping("")
    public String showList(Model model,
                           @PageableDefault(size = 2)
                           Pageable pageable) {
        Page<Blog> blogList = iBlogService.findAllByFlagDeleteFalse(pageable);
        List<Category> categoryList = iCategoryService.findAll();
        model.addAttribute("category", new Category());
        model.addAttribute("categoryList", categoryList);
        model.addAttribute("blog", new Blog());
        model.addAttribute("blogList", blogList);
        return "/blog/list";
    }

    @PostMapping("/create")
    public String createBlog(@ModelAttribute("blog") Blog blog) {
        iBlogService.save(blog);
        return "redirect:/blog";
    }

    @PostMapping("/delete")
    public String deleteBlog(@RequestParam("id") Integer id, RedirectAttributes redirectAttributes) {
        Boolean check = iBlogService.existsById(id);
        if (iBlogService.existsById(id)) {
            iBlogService.deleted(id);

        } else {
            redirectAttributes.addFlashAttribute("invalidIDMessage", "Invalid ID!");
        }
        return "redirect:/blog";
    }

    @GetMapping("/update/{id}")
    public String showFormEdit(@PathVariable("id") Integer id, Model model, RedirectAttributes redirectAttributes) {
        Boolean check = iBlogService.existsById(id);
        if (check) {
            model.addAttribute("blog", iBlogService.findById(id));
        } else {
            redirectAttributes.addFlashAttribute("invalidIDMessage", "Invalid ID!");
            return "redirect:/blog";
        }
        return "/blog/edit";
    }

    @PostMapping("/update")
    public String updateBlog(@ModelAttribute("blog") Blog blog, RedirectAttributes redirectAttributes) {
        Boolean check = iBlogService.existsById(blog.getId());
        if (check) {
            iBlogService.update(blog);
        } else {
            redirectAttributes.addFlashAttribute("invalidIDMessage", "Invalid ID!");
        }
        return "redirect:/blog";
    }

    @GetMapping("/search")
    public String searchProduct(@RequestParam("name") String name, Model model,
                                @PageableDefault(size = 2)
                                Pageable pageable) {
        Page<Blog> blogList = iBlogService.findBlogByNameContainingIgnoreCaseAndFlagDeleteFalse(pageable, name);
        List<Category> categoryList = iCategoryService.findAll();
        model.addAttribute("category", new Category());
        model.addAttribute("categoryList", categoryList);
        model.addAttribute("blog", new Blog());
        model.addAttribute("blogList", blogList);
        return "blog/list";
    }
}
