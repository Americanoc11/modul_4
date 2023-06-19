package com.example.programsaveemail.service;

import com.example.programsaveemail.model.EmailConfig;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmailConfigService implements IEmailConfigService {
    private static List<EmailConfig> emailList;
    static {
        emailList= new ArrayList<>();
        emailList.add(new EmailConfig(1L,"Thor"));
        emailList.add(new EmailConfig(2L,"Caption American"));
        emailList.add(new EmailConfig(3L,"Iron man"));
    }

    @Override
    public List<EmailConfig> findAll() {
        return emailList;
    }

    @Override
    public void save(EmailConfig emailConfig) {

    }
}
