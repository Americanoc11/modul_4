package com.example.blog_app.repository;

import com.example.blog_app.model.Blog;
import com.example.blog_app.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    List<Blog> getBlogsByCategoryName(String name);

}
