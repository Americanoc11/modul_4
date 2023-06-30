package com.example.blog_app.service;

import com.example.blog_app.model.Blog;
import com.example.blog_app.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Objects;

public interface IBlogService {

    void save(Blog blog);

    void deleted(Integer id);

    Blog findById(Integer id);

    void update(Blog blog);

    List<Blog> findBlogByNameContainingIgnoreCase(String name);

    Page<Blog> findAllByFlagDeleteFalse(Pageable pageable);

    boolean existsById(Integer id);

    Page<Blog> findBlogByNameContainingIgnoreCaseAndFlagDeleteFalse(Pageable pageable, String name);

    List<Blog> getBlogs();

    List<Blog> findAllByCategory(Category category);

    void create(Blog blog);

    Blog getUserDetail(Integer id);

    List<Blog> findAllByName(String name);
}
