package com.example.demoapplogin.repository;

import com.example.demoapplogin.model.Login;
import com.example.demoapplogin.model.User;

public interface IUserRepository {
    User checkLogin(Login login);
}
