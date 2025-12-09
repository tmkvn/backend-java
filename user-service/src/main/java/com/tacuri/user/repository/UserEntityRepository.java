package com.tacuri.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tacuri.user.entity.UserEntity;

public interface UserEntityRepository extends JpaRepository<UserEntity, Long> {
    
}
