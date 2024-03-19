package com.devops.sample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devops.sample.entities.AuthEntity;


@Repository
public interface AuthRepository extends JpaRepository<AuthEntity, String>{
    public AuthEntity findByUsernameAndPassword(String username, String password);
}
