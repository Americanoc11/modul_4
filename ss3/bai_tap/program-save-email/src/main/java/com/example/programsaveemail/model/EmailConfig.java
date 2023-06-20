package com.example.programsaveemail.model;

public class EmailConfig {
    private Long id;
    private String emailAddress;
    private String describe;
    private String language;
    private int pageSize;
    private boolean spamFillter;

    public EmailConfig() {
    }

    public EmailConfig(String emailAddress, String describe, String language, int pageSize, boolean spamFillter) {
        this.emailAddress = emailAddress;
        this.describe = describe;
        this.language = language;
        this.pageSize = pageSize;
        this.spamFillter = spamFillter;
    }

    public EmailConfig(Long id, String emailAddress, String describe, String language, int pageSize, boolean spamFillter) {
        this.id = id;
        this.emailAddress = emailAddress;
        this.describe = describe;
        this.language = language;
        this.pageSize = pageSize;
        this.spamFillter = spamFillter;
    }

    public EmailConfig(Long id, String emailAddress, String describe) {
        this.id = id;
        this.emailAddress = emailAddress;
        this.describe = describe;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean getSpamFillter() {
        return spamFillter;
    }

    public void setSpamFillter(boolean spamFillter) {
        this.spamFillter = spamFillter;
    }

    public EmailConfig(Long id, String emailAddress) {
        this.id = id;
        this.emailAddress = emailAddress;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
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
