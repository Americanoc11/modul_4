package com.example.programsaveemail.service;

import com.example.programsaveemail.model.EmailConfig;
import com.example.programsaveemail.repository.IEmailConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmailConfigService implements IEmailConfigService {
   @Autowired
    private IEmailConfigRepository iEmailConfigRepository;

    @Override
    public List<EmailConfig> findAll() {
        return iEmailConfigRepository.findAll();
    }

    @Override
    public void save(EmailConfig emailConfig) {
iEmailConfigRepository.save(emailConfig);
    }

    @Override
    public Object findById(long id) {
        return iEmailConfigRepository.findById(id);
    }

    @Override
    public void update(EmailConfig emailConfig) {
        iEmailConfigRepository.update(emailConfig);
    }
}
