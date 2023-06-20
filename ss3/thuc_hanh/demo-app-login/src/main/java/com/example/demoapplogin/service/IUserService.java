package com.example.demoapplogin.service;

import com.example.demoapplogin.model.Login;
import com.example.demoapplogin.model.User;

public interface IUserService {
    User checkLogin(Login login);
}
