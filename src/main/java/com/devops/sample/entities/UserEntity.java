package com.devops.sample.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class UserEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

    @Column(name = "username", columnDefinition = "varchar")
    private String username;

    @Column(name = "password", columnDefinition = "varchar")
    private String password;

    @Column(name = "subject", columnDefinition = "varchar")
    private String subject;

    @Column(name = "phoneno", columnDefinition = "varchar")
    private String phno;

    @Column(name = "email", columnDefinition = "varchar")
    private String email;

    @Column(name = "city", columnDefinition = "varchar")
    private String city;

}
