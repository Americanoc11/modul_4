package com.example.democase.service;

import com.example.democase.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
    Category create(Category category);
    Category findById(Integer id);
    Category update(Category category);
    void deleteById(Integer id);
    void enableById(Integer id);
}
