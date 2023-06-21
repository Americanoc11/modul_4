package com.example.programsaveemail.repository;

import com.example.programsaveemail.model.EmailConfig;

import java.util.List;

public interface IEmailConfigRepository {
    List<EmailConfig> findAll();

    void save(EmailConfig emailConfig);

    Object findById(long id);

    void update(EmailConfig emailConfig);
}
