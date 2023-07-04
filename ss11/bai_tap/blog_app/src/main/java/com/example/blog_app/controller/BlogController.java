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


    @GetMapping()
    public ResponseEntity<List<Blog>> getblog() {
        return new ResponseEntity<>(iBlogService.findAll(), HttpStatus.OK);
    }


    @PostMapping()
    public ResponseEntity<?> createProduct(@RequestBody Blog blog) {
        iBlogService.create(blog);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping("{id}")
    public ResponseEntity<?> getBlogDetails(@PathVariable Integer id) {
        boolean check = iBlogService.existsById(id);
        if (check) {
            return new ResponseEntity<>(iBlogService.findById(id), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBlog(@PathVariable("id") Integer id) {
        boolean check = iBlogService.existsById(id);
        if (check) {
            iBlogService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<?> updateBlog(@RequestBody Blog blog, @PathVariable("id") Integer id) {
        boolean check = iBlogService.existsById(id);
        if (check) {
            iBlogService.update(blog);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<Blog>> getBlogByCategory(@PathVariable(value = "name") String name) {
        List<Blog> blogList = iBlogService.getBlogByCategoryName(name);
        if (blogList.size() != 0) {
            return new ResponseEntity<>(iBlogService.getBlogByCategoryName(name), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
