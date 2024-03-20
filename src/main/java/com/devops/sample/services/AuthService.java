package com.devops.sample.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devops.sample.entities.AuthEntity;
import com.devops.sample.entities.UserEntity;
import com.devops.sample.repositories.AuthRepository;
import com.devops.sample.repositories.UserRepository;

@Service
public class AuthService {
    
    @Autowired
    private AuthRepository auth;

    @Autowired
    private UserRepository user;
    
    public String login (AuthEntity creds){
        AuthEntity cred = auth.findByUsernameAndPassword(creds.getUsername(),creds.getPassword());
        if(cred!=null){
            return "Welcome, " + creds.getUsername() + "!";
        }
        else{
            return "Invalid Credentials";
        }
    }

    public UserEntity register(UserEntity body){
        return user.save(body);
    }
}
