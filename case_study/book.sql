create database book_management;
use book_management;
-- Tạo bảng Book để lưu trữ thông tin sách 
CREATE TABLE Book (
id INT AUTO_INCREMENT PRIMARY KEY,
title VARCHAR(255) NOT NULL,
author VARCHAR(255) NOT NULL,
publication_year INT NOT NULL,
available BOOLEAN DEFAULT TRUE
);
-- Tạo bảng User để lưu trữ thông tin người dùng
CREATE TABLE User (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(255) NOT NULL,
email VARCHAR(255) NOT NULL,
password VARCHAR(255) NOT NULL
);
-- Tạo bảng Loan để lưu trữ thông tin phiếu mượn sách
CREATE TABLE Loan (
id INT AUTO_INCREMENT PRIMARY KEY,
book_id INT NOT NULL,
user_id INT NOT NULL,
borrowed_date DATE NOT NULL,
due_date DATE NOT NULL,
returned_date DATE,
FOREIGN KEY (book_id) REFERENCES Book(id),
FOREIGN KEY (user_id) REFERENCES User(id)
);