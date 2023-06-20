package com.example.demodatabiding.model;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getHobbie() {
        return hobbie;
    }

    public void setHobbie(List<String> hobbie) {
        this.hobbie = hobbie;
    }
}
