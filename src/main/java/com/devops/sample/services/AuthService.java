package com.devops.sample.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devops.sample.entities.AuthEntity;
import com.devops.sample.repositories.AuthRepository;

@Service
public class AuthService {
    
    @Autowired
    private AuthRepository auth;
    
    public String login (String username, String password){
        String uname = "admin";
        String pass = "pass";
        if(username.equals(uname) && password.equals(pass)){
            return "Success";
        }
        else{
            return "Invalid Credentials";
        }
    }

    public AuthEntity register(AuthEntity user){
        return auth.save(user);
    }
}
