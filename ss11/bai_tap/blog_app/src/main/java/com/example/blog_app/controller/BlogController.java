package com.example.blog_app.controller;

import com.example.blog_app.model.Blog;
import com.example.blog_app.model.Category;
import com.example.blog_app.service.IBlogService;
import com.example.blog_app.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private ICategoryService iCategoryService;


    @GetMapping("/list")
    public ResponseEntity<List<Blog>> getblog() {
        return new ResponseEntity<>(iBlogService.findAll(), HttpStatus.OK);
    }


    @PostMapping("/create")
    public ResponseEntity<?> createProduct(@RequestBody Blog blog) {
        iBlogService.create(blog);
        return new ResponseEntity<>(HttpStatus.OK);
    }// lỗi k bắt được category


    @GetMapping("/details/{id}")
    public ResponseEntity<?> getBlogDetails(@PathVariable Integer id) {
        boolean check = iBlogService.existsById(id);
        if (check) {
            return new ResponseEntity<>(iBlogService.findById(id), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteBlog(@PathVariable("id") Integer id) {
        boolean check = iBlogService.existsById(id);
        if (check) {
            iBlogService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/update")
    public ResponseEntity<?> updateBlog(@RequestBody Blog blog) {
        boolean check = iBlogService.existsById(blog.getId());
        if (check) {
            iBlogService.update(blog);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/blog-list-category/{name}")
    public List<Blog> getBlogByCategory(@PathVariable("name") String name) {
        Category category = iCategoryService.findByNameContainingIgnoreCase(name);
        List<Blog> blogList = iBlogService.findAllByCategory(category);
        return blogList;
    }

}
