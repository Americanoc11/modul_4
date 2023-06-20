package com.example.demothymeleaf.model;

import java.util.List;

public class User {
    private int id;
    private String name;
    private String gender;
    private Boolean admin;
    private String type;
    private String country;
    private List<String> hobbie;

    public User(int id, String name, String gender, Boolean admin, String type, String country, List<String> hobbie) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.admin = admin;
        this.type = type;
        this.country = country;
        this.hobbie = hobbie;
    }

    public User() {
    }
}
