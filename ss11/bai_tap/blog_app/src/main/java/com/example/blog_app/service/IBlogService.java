package com.example.blog_app.service;

import com.example.blog_app.model.Blog;
import com.example.blog_app.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Objects;

public interface IBlogService {


    Blog findById(Integer id);

    void update(Blog blog);


    boolean existsById(Integer id);


    List<Blog> findAllByCategory(Category category);

    void create(Blog blog);

    Blog getUserDetail(Integer id);

    List<Blog> findAll();

    void delete(Integer id);
}
