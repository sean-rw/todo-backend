package com.seanrw.todobackend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seanrw.todobackend.dtos.requests.LoginRequest;
import com.seanrw.todobackend.dtos.requests.NewUserRequest;
import com.seanrw.todobackend.models.User;
import com.seanrw.todobackend.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepo;

    public User signup(NewUserRequest req) {
        User user = new User(req.getUsername(), req.getPassword());
        userRepo.save(user);
        return user;
    }

    // public Principal login(LoginRequest req) {
    //     Optional<User> user = userRepo.
    // }
}