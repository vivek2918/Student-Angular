package com.example.Student_Management.Models;

import jakarta.persistence.*;

@Entity
@Table(name="Student_Info")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;

    private String lastName;

    @Column(unique = true)
    private String emailId;


    private String mobileNo;

    private String country;

    public Student() {
    }

    public Student(String firstName, String lastName, String emailId, String mobileNo, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.mobileNo = mobileNo;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
