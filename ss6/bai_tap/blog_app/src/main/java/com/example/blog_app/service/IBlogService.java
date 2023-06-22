package com.example.blog_app.service;

import com.example.blog_app.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    void deleted(Integer id);

    Blog findById(Integer id);

    void update(Blog blog);

    List<Blog> findBlogByNameContainingIgnoreCase(String name);
}
