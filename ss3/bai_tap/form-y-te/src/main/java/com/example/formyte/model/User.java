package com.example.formyte.model;

import java.util.Arrays;

public class User {
    private int id;
    private String fullname;
    private String yearDate;
    private Boolean gender;
    private String country;
    private String pastCode;
    private String travel;
    private String idTravel;
    private int quantityTable;
    private String dateStart;
    private String dateEnd;
    private String describeTravel;
    private String address;
    private String phone;
    private String email;
    private String[] indication;
    private String[] historyExposure;

    public User(String fullname, String yearDate, Boolean gender, String country, String pastCode, String travel, String idTravel, int quantityTable, String dateStart, String dateEnd, String describeTravel, String address, String phone, String email, String[] indication, String[] historyExposure) {
        this.fullname = fullname;
        this.yearDate = yearDate;
        this.gender = gender;
        this.country = country;
        this.pastCode = pastCode;
        this.travel = travel;
        this.idTravel = idTravel;
        this.quantityTable = quantityTable;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.describeTravel = describeTravel;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.indication = indication;
        this.historyExposure = historyExposure;
    }

    public User(int id, String fullname, String yearDate, Boolean gender, String country, String pastCode, String travel, String idTravel, int quantityTable, String dateStart, String dateEnd, String describeTravel, String address, String phone, String email, String[] indication, String[] historyExposure) {
        this.id = id;
        this.fullname = fullname;
        this.yearDate = yearDate;
        this.gender = gender;
        this.country = country;
        this.pastCode = pastCode;
        this.travel = travel;
        this.idTravel = idTravel;
        this.quantityTable = quantityTable;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.describeTravel = describeTravel;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.indication = indication;
        this.historyExposure = historyExposure;
    }

    public User() {

    }

    public User(int id, String fullname, String dateOfBirth, Boolean gender, String country, String travel, String idTravel, int quantityTable, String dateStart, String dateEnd, String describeTravel, String address, String phone, String email, String[] indication, String[] historyExposure) {
        this.id = id;
        this.fullname = fullname;
        this.yearDate = dateOfBirth;
        this.gender = gender;
        this.country = country;
        this.travel = travel;
        this.idTravel = idTravel;
        this.quantityTable = quantityTable;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.describeTravel = describeTravel;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.indication = indication;
        this.historyExposure = historyExposure;
    }

    public User(String fullname, String dateOfBirth, Boolean gender, String country, String travel, String idTravel, int quantityTable, String dateStart, String dateEnd, String describeTravel, String address, String phone, String email, String[] indication, String[] historyExposure) {
        this.fullname = fullname;
        this.yearDate = dateOfBirth;
        this.gender = gender;
        this.country = country;
        this.travel = travel;
        this.idTravel = idTravel;
        this.quantityTable = quantityTable;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.describeTravel = describeTravel;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.indication = indication;
        this.historyExposure = historyExposure;
    }

    public String getPastCode() {
        return pastCode;
    }

    public void setPastCode(String pastCode) {
        this.pastCode = pastCode;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", dateOfBirth='" + yearDate + '\'' +
                ", gender=" + gender +
                ", country='" + country + '\'' +
                ", travel='" + travel + '\'' +
                ", idTravel='" + idTravel + '\'' +
                ", quantityTable=" + quantityTable +
                ", dateStart='" + dateStart + '\'' +
                ", dateEnd='" + dateEnd + '\'' +
                ", describeTravel='" + describeTravel + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", indication=" + Arrays.toString(indication) +
                ", historyExposure=" + Arrays.toString(historyExposure) +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getYearDate() {
        return yearDate;
    }

    public void setYearDate(String dateOfBirth) {
        this.yearDate = dateOfBirth;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTravel() {
        return travel;
    }

    public void setTravel(String travel) {
        this.travel = travel;
    }

    public String getIdTravel() {
        return idTravel;
    }

    public void setIdTravel(String idTravel) {
        this.idTravel = idTravel;
    }

    public int getQuantityTable() {
        return quantityTable;
    }

    public void setQuantityTable(int quantityTable) {
        this.quantityTable = quantityTable;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getDescribeTravel() {
        return describeTravel;
    }

    public void setDescribeTravel(String describeTravel) {
        this.describeTravel = describeTravel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getIndication() {
        return indication;
    }

    public void setIndication(String[] indication) {
        this.indication = indication;
    }

    public String[] getHistoryExposure() {
        return historyExposure;
    }

    public void setHistoryExposure(String[] historyExposure) {
        this.historyExposure = historyExposure;
    }
}
