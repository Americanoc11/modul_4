package com.example.blog_app.service;

import com.example.blog_app.model.Blog;
import com.example.blog_app.model.Category;
import com.example.blog_app.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;

    @Override
    public List<Category> findAll() {
        return iCategoryRepository.findAll();
    }

    @Override
    public void save(Category category) {
        iCategoryRepository.save(category);
    }


    @Override
    public void deleted(Integer id) {
        Category category = this.findById(id);
        category.setFlagDelete(true);
        iCategoryRepository.save(category);
    }

    @Override
    public Category findById(Integer id) {
        return this.iCategoryRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Not found Id" + id));
    }


    @Override
    public void update(Category category) {
        this.iCategoryRepository.save(category);
    }

    @Override
    public List<Category> findByNameContainingIgnoreCase(String name) {
        return iCategoryRepository.findByNameContainingIgnoreCase(name);
    }

    @Override
    public boolean exitsById(Integer id) {
        return iCategoryRepository.existsById(id);
    }

}
