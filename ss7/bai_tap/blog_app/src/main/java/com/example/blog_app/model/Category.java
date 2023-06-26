package com.example.blog_app.model;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name", unique = true, nullable = false)
    private String name;
    private boolean flagDelete;

    public Category() {
    }

    public Category(Integer id, String name, boolean flagDelete) {
        this.id = id;
        this.name = name;
        this.flagDelete = flagDelete;
    }

    public Category(String name) {
        this.name = name;
    }

    public boolean isFlagDelete() {
        return flagDelete;
    }

    public void setFlagDelete(boolean flagDelete) {
        this.flagDelete = flagDelete;
    }

    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
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
}
