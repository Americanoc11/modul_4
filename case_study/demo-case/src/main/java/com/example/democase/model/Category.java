package com.example.democase.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    @Column(name = "is_delete")
    private boolean isDelete;
    @Column(name = "is_active")
    private boolean isActive;

    public Category(String name) {
        this.name = name;
        this.isDelete = false;
        this.isActive = true;
    }
}
