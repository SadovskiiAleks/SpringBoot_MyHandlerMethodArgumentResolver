package com.example.rest.controller;

import com.example.rest.model.Authorities;
import com.example.rest.model.User;
import com.example.rest.service.AuthorizationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorizationController {
    @Autowired
    AuthorizationService service;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid User user) {
        System.out.println(user.getName());
        System.out.println(user.getPassword());
        System.out.println(user.getMethodOfRequest());
        return service.getAuthorities(user);
    }


}
