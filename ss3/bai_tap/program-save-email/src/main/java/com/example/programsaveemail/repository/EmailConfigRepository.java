package com.example.programsaveemail.repository;

import com.example.programsaveemail.model.EmailConfig;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmailConfigRepository implements IEmailConfigRepository{
    private static List<EmailConfig> emailList;

    static {
        emailList = new ArrayList<>();
        emailList.add(new EmailConfig(1L, "Thor", "Vua của Agaska", "English", 15, true));
        emailList.add(new EmailConfig(2L, "Caption American", "Đội trưởng nước Mỹ", "VietNamese", 15, true));
        emailList.add(new EmailConfig(3L, "Iron man", "Thợ máy siêu anh hùng", "English", 15, true));
    }

    @Override
    public List<EmailConfig> findAll() {
        return emailList;
    }

    @Override
    public void save(EmailConfig emailConfig) {
        emailConfig.setId(emailList.size() + 1L);
        emailConfig.setEmailAddress(emailConfig.getEmailAddress());
        emailList.add(emailConfig);

    }

    @Override
    public Object findById(long id) {
        for (EmailConfig e : emailList) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    @Override
    public void update(EmailConfig emailConfig) {
        for (EmailConfig e : emailList) {
            if (e.getId() == emailConfig.getId()) {
                e.setEmailAddress(emailConfig.getEmailAddress());
                e.setDescribe(emailConfig.getDescribe());
                e.setLanguage(emailConfig.getLanguage());
                e.setSpamFillter(emailConfig.getSpamFillter());
                e.setPageSize(emailConfig.getPageSize());
            }
        }
    }
}
