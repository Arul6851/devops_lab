package com.devops.sample.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.devops.sample.entities.AuthEntity;
import com.devops.sample.entities.UserEntity;
import com.devops.sample.services.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/auth")
public class AuthController {
    
    @Autowired
    AuthService auth;

    @GetMapping("/login")
    public String login(AuthEntity creds) {
        return auth.login(creds);
    }

    @PostMapping("/register")
    public UserEntity register(UserEntity creds) {
        
        return auth.register(creds);
    }
    
}
