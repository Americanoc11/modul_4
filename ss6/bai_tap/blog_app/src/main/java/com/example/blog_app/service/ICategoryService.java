package com.example.blog_app.service;

import com.example.blog_app.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
}
