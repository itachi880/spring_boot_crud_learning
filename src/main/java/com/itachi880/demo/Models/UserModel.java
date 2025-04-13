package com.itachi880.demo.Models;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserModel extends JpaRepository<User, Long> {
    
}