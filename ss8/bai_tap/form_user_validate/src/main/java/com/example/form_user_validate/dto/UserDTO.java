package com.example.form_user_validate.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserDTO {
    private Integer id;
    @Size(min = 5, max = 45, message = "Tối thiểu 5 kí tự, tối đa 45 kí tự")
    @NotBlank(message = "Không được để trống")
    private String firstName;
    @Size(min = 5, max = 45, message = "Tối thiểu 5 kí tự, tối đa 45 kí tự")
    @NotBlank(message = "Không được để trống")
    private String lastName;
    @Size(min = 10, max = 11, message = "Tối thiểu 10 số, tối đa 11 số")
    private String phoneNumber;
    @Min(value = 18, message = "Phải lớn hơn 18 tuổi")
    private Integer age;
    @NotBlank(message = "Không được để trống")
    @Email(message = "Xin nhập đúng định dạng. Vd: example@gmail.com")
    private String email;

    public UserDTO() {
    }

    public UserDTO(Integer id, String firstName, String lastName, String phoneNumber, Integer age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
