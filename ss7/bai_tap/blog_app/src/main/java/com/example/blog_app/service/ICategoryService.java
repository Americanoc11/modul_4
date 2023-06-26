package com.example.blog_app.service;

import com.example.blog_app.model.Blog;
import com.example.blog_app.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();

    void save(Category category);

    void deleted(Integer id);

    Category findById(Integer id);

    void update(Category category);

    List<Category> findByNameContainingIgnoreCase(String name);

    boolean exitsById(Integer id);
}
