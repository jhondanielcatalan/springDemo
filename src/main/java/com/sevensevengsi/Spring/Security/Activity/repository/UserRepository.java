package com.sevensevengsi.Spring.Security.Activity.repository;

import com.sevensevengsi.Spring.Security.Activity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends  JpaRepository<User, Integer>{
    public User findByUsername(String username);
}
