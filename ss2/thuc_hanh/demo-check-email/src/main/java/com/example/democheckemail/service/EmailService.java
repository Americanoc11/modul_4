package com.example.democheckemail.service;

import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class EmailService implements IEmailService {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    @Override
    public boolean checkEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        if (pattern.matcher(email).find()) {
            return true;
        } else {
            return false;
        }
    }
}
