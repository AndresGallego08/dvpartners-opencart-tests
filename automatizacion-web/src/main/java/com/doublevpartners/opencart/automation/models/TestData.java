package com.doublevpartners.opencart.automation.models;

public class TestData {

    private String emailAddress;
    private String password;

    public TestData(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;

    }

    public String getEmail() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }

}
