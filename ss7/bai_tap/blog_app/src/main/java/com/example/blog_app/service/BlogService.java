package com.example.blog_app.service;

import com.example.blog_app.model.Blog;
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
    public void save(Blog blog) {
        blog.setFlagDelete(false);
        iBlogRepository.save(blog);
    }

    @Override
    public void deleted(Integer id) {
        Blog blog=this.findById(id);
        blog.setFlagDelete(true);
        iBlogRepository.save(blog);
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

    @Override
    public Page<Blog> findAllByFlagDeleteFalse(Pageable pageable) {
        return iBlogRepository.findAllByFlagDeleteFalse(pageable);
    }

    @Override
    public boolean existsById(Integer id) {
        return iBlogRepository.existsById(id);
    }

    @Override
    public Page<Blog> findBlogByNameContainingIgnoreCaseAndFlagDeleteFalse(Pageable pageable, String name) {
        return iBlogRepository.findBlogByNameContainingIgnoreCaseAndFlagDeleteFalse(pageable,name);
    }


}
