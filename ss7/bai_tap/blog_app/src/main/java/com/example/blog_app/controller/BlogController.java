package com.example.blog_app.controller;

import com.example.blog_app.model.Blog;
import com.example.blog_app.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("blog")
public class BlogController {
    @Autowired
    private IBlogService iBlogService;


    @GetMapping("")
    public String showList(Model model) {
        List<Blog> blogList = iBlogService.findAll();
//        if (blogList.size() == 0) {
//        } else {
//        }
        model.addAttribute("blogList", blogList);
        model.addAttribute("result", "Blog empty");
        model.addAttribute("blog", new Blog());
        return "/blog/list";
    }

    @PostMapping("/create")
    public String createBlog(@ModelAttribute("blog") Blog blog) {
        iBlogService.save(blog);
        return "redirect:/blog";
    }

    @PostMapping("/delete")
    public String deleteBlog(@RequestParam("id") Integer id) {
        iBlogService.deleted(id);
        return "redirect:/blog";
    }

    @GetMapping("/update/{id}")
    public String showFormEdit(@PathVariable("id") Integer id, Model model) {
        Blog blog = iBlogService.findById(id);
        model.addAttribute("blog", blog);
        return "/blog/edit";
    }

    @PostMapping("/update")
    public String updateBlog(@ModelAttribute("blog") Blog blog) {
        iBlogService.update(blog);
        return "redirect:/blog";
    }
}
