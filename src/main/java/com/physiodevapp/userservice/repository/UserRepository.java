package com.physiodevapp.userservice.repository;

import com.physiodevapp.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
}