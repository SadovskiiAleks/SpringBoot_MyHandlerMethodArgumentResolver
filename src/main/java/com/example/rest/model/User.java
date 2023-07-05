package com.example.rest.model;

import jakarta.validation.constraints.*;

public class User {
    @NotBlank
    @Size(min = 2, max = 30)
    private String name;
    @Size(min = 1, max = 30)
    private String password;

    private String methodOfRequest;

    public User() {
    }

    public User(String name, String password, String methodOfRequest) {
        this.name = name;
        this.password = password;
        this.methodOfRequest = methodOfRequest;
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

    public String getMethodOfRequest() {
        return methodOfRequest;
    }

    public void setMethodOfRequest(String methodOfRequest) {
        this.methodOfRequest = methodOfRequest;
    }
}
