package com.example.demo2.repository;

import com.example.demo2.model.User;

import java.util.List;

public interface IUserRepository {
    List<User> getAll();
}
