package com.example.blog_app.model;

import javax.persistence.*;

@Entity
@Table(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    @Column(name = "content",columnDefinition = "longtext")
    private String content;
    @ManyToOne
    @JoinColumn(name = "categories_id", nullable = false)
    private Category category;
    @Column(name = "is_delete")
    private boolean flagDelete;

    public Blog(Integer id, String name, String content, Category category, boolean flagDelete) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.category = category;
        this.flagDelete = flagDelete;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isFlagDelete() {
        return flagDelete;
    }

    public Blog(Integer id, String name, String content, boolean flagDelete) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.flagDelete = flagDelete;
    }

    public Blog() {
    }

    public Blog(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public Blog(Integer id, String name, String content) {
        this.id = id;
        this.name = name;
        this.content = content;
    }

    public boolean getFlagDelete() {
        return flagDelete;
    }

    public void setFlagDelete(boolean flagDelete) {
        this.flagDelete = flagDelete;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

