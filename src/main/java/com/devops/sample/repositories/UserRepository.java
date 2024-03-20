package com.devops.sample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devops.sample.entities.UserEntity;



@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{
}
