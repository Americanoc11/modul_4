package com.example.blog_app.service;

import com.example.blog_app.model.Blog;
import com.example.blog_app.model.Category;
import com.example.blog_app.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;


    @Override
    public Blog findById(Integer id) {
        return this.iBlogRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Not found blog by id" + id));
    }

    @Override
    public void update(Blog blog) {
        if (this.existsById(blog.getId())) {
            this.iBlogRepository.save(blog);
        } else {
            throw new IllegalArgumentException("Invalid id: " + blog.getId());
        }
    }


    @Override
    public boolean existsById(Integer id) {
        return iBlogRepository.existsById(id);
    }

    @Override
    public List<Blog> findAllByCategory(Category category) {
        return null;
    }


    @Override
    public void create(Blog blog) {
        blog.setFlagDelete(false);
        iBlogRepository.save(blog);
    }

    @Override
    public Blog getUserDetail(Integer id) {
        return this.iBlogRepository.findById(id).orElseThrow(null);
    }

    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        Blog blog = this.findById(id);
        blog.setFlagDelete(true);
        iBlogRepository.save(blog);
    }


}
