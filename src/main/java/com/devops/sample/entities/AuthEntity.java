package com.devops.sample.entities;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "auth")
public class AuthEntity {
    
    @Id
    @Column(name = "username", columnDefinition = "varchar")
    private String username;

    @Nonnull
    @Column(name = "password", columnDefinition = "varchar")
    private String password;

    AuthEntity(){
        
    }

}
