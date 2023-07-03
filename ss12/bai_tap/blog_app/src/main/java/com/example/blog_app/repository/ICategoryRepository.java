package com.example.blog_app.repository;

import com.example.blog_app.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {
    Category findAllByNameContainingIgnoreCase(String name);


}
