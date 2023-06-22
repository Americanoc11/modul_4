package com.example.blog_app.service;

import com.example.blog_app.model.Blog;
import com.example.blog_app.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public void deleted(Integer id) {
        iBlogRepository.deleteById(id);
    }

    @Override
    public Blog findById(Integer id) {
        return this.iBlogRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Not found blog by id" + id));
    }

    @Override
    public void update(Blog blog) {
        this.iBlogRepository.saveAndFlush(blog);
    }

    @Override
    public List<Blog> findBlogByNameContainingIgnoreCase(String name) {
        return iBlogRepository.findBlogByNameContainingIgnoreCase(name);
    }
}
