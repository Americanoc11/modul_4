package com.example.programsaveemail.model;

public class EmailConfig {
    private Long id;
    private String emailAddress;

    public EmailConfig() {
    }

    public EmailConfig(Long id, String emailAddress) {
        this.id = id;
        this.emailAddress = emailAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
