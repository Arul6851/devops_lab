package com.devops.sample.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.devops.sample.entities.AuthEntity;
import com.devops.sample.services.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/auth")
public class AuthController {
    
    @Autowired
    AuthService auth;

    @GetMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        return auth.login(username, password);
    }

    @PostMapping("/register")
    public AuthEntity register(@RequestBody AuthEntity entity) {
        
        return auth.register(entity);
    }
    
}
