package com.example.blog_app.service;

import com.example.blog_app.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {

    void save(Blog blog);

    void deleted(Integer id);

    Blog findById(Integer id);

    void update(Blog blog);

    List<Blog> findBlogByNameContainingIgnoreCase(String name);

    Page<Blog> findAllByFlagDeleteFalse(Pageable pageable);
}
