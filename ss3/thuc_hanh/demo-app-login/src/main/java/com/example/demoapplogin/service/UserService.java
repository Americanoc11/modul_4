package com.example.demoapplogin.service;

import com.example.demoapplogin.model.Login;
import com.example.demoapplogin.model.User;
import com.example.demoapplogin.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public User checkLogin(Login login) {
        return iUserRepository.checkLogin(login);
    }
}
