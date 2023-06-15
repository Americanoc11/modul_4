package com.example.demo2.repository;

import com.example.demo2.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository implements IUserRepository{
    private static List<User> userList;
    static {
        userList= new ArrayList<>();
        userList.add(new User(1,"Duc","duc@gmail.com","Đà Nẵng"));
        userList.add(new User(2,"Hai","duc@gmail.com","Đà Nẵng"));
        userList.add(new User(3,"Hanh","duc@gmail.com","Đà Nẵng"));
    }
    @Override
    public List<User> getAll() {
        return userList;
    }
}
