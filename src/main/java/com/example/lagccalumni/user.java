package com.example.lagccalumni;

public class user {
    private String email;
    private String password;

    public user(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
