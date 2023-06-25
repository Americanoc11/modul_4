package com.example.democase.service.impl_category;

import com.example.democase.model.Category;
import com.example.democase.repository.ICategoryRepository;
import com.example.democase.service.ICategoryService;
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
    public Category create(Category category) {
        Category categorySave = new Category(category.getName());
        return iCategoryRepository.save(categorySave);
    }

    @Override
    public Category findById(Integer id) {
        return this.iCategoryRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Not found Id" + id));
    }

    @Override
    public Category update(Category category) {
        Category categoryUpdate = new Category();
        categoryUpdate.setName(category.getName());
        categoryUpdate.setActive(category.isActive());
        categoryUpdate.setDelete(category.isDelete());
        return iCategoryRepository.save(categoryUpdate);
    }

    @Override
    public void deleteById(Integer id) {
        Category category = this.findById(id);
        if (category.getId() == id) {
            category.setDelete(true);
            category.setActive(false);
            iCategoryRepository.save(category);
        } else {
            new IllegalAccessException("Not Found Id " + id);
        }
    }

    @Override
    public void enableById(Integer id) {
        Category category = this.findById(id);
        category.setActive(true);
        category.setDelete(false);
        iCategoryRepository.save(category);
    }
}
