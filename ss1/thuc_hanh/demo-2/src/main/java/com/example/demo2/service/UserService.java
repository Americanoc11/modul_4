package com.example.demo2.service;

import com.example.demo2.model.User;
import com.example.demo2.repository.IUserRepository;
import com.example.demo2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository iUserRepository = new UserRepository();

    @Override
    public List<User> getAll() {
        return iUserRepository.getAll();
    }
}
