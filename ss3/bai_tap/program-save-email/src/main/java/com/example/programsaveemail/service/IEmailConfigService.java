package com.example.programsaveemail.service;

import com.example.programsaveemail.model.EmailConfig;

import java.util.List;

public interface IEmailConfigService {
    List<EmailConfig> findAll();

    void save(EmailConfig emailConfig);
}
