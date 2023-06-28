package com.example.rest.model;

import jakarta.validation.constraints.*;

public class User {
    @NotBlank
    @Size(min = 2, max = 30)
    private String name;
    @Size(min = 1, max = 30)
    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
