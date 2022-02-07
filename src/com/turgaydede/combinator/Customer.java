package com.turgaydede.combinator;

import java.time.LocalDate;

public class Customer {
    private String customerName;
    private String phoneNumber;
    private String email;
    private LocalDate birthDate;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Customer(String customerName, String phoneNumber, String email, LocalDate birthDate) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthDate = birthDate;
    }
}

