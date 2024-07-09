package com.example.web.development.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")


public class Student {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 @Column(nullable = false)
 private String firstname;
 @Column(nullable = false)
 private String lastname;
 @Column(nullable = false)
 private String email;
 @Column(nullable = false)
 private String password;
 public String getPassword() {
    return password;
}
public void setPassword(String password) {
    this.password = password;
}
@Column(nullable = false) 
 private String country;
 @Column (nullable = false)
 private int age;
 @Column(nullable = false)
 private String address;
public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getCountry() {
    return country;
}
public void setCountry(String country) {
    this.country = country;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public String getLastname() {
    return lastname;
}
public void setLastname(String lastname) {
    this.lastname = lastname;
}
public String getFirstname() {
    return firstname;
}
public void setFirstname(String firstname) {
    this.firstname = firstname;
}
public long getId() {
    return id;
}
public void setId(long id) {
    this.id = id;
}
     
}