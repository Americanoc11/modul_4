package com.example.blog_app.repository;

import com.example.blog_app.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    List<Blog> searchByNameContainingIgnoreCase(String name);
    boolean findBlogById(Integer id);

    List<Blog> findAllById(Integer id);
}
