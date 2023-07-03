package com.example.blog_app.controller;

import com.example.blog_app.model.Category;
import com.example.blog_app.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/categories")
@CrossOrigin("*")

public class CategoryController {
    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("/category/list")
    public ResponseEntity<List<Category>> getCategory() {
        return new ResponseEntity<>(iCategoryService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> createCategory(@RequestBody Category category) {
        iCategoryService.create(category);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @GetMapping("/details/{id}")
    public ResponseEntity<?> getCategoryDetails(@PathVariable Integer id) {
        boolean check = iCategoryService.exitsById(id);
        if (check) {
            return new ResponseEntity<>(iCategoryService.findById(id), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteCategory(@PathVariable("id") Integer id) {
        boolean check = iCategoryService.exitsById(id);
        if (check) {
            iCategoryService.deleted(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/update")
    public ResponseEntity<?> updateCategory(@RequestBody Category category) {
        boolean check = iCategoryService.exitsById(category.getId());
        if (check) {
            iCategoryService.update(category);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
