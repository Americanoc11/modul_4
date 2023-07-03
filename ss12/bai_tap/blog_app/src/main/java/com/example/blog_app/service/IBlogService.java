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


    void create(Blog blog);


    List<Blog> findAll();

    void delete(Integer id);

    List<Blog> getBlogByCategoryName(String name);

    List<Blog> findAllByName(String name);

    List<Blog> findAllByFlagDeleteIsFalseAndLimit(Integer number);
}
