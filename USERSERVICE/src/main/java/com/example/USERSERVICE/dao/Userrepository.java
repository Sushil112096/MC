package com.example.USERSERVICE.dao;

import com.example.USERSERVICE.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepository extends JpaRepository<User,String> {
}
