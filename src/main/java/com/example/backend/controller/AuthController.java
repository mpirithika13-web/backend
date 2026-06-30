package com.example.backend.controller;

import com.example.backend.model.User;
import com.example.backend.service.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    public User signup( @RequestBody User user) {
    return  authService.signup(user);
    }
    @PostMapping("/login")
    public String login( @RequestBody User user) {

        boolean status = authService.login( user.getEmail(), user.getPassword());

        if (status) {
            return "Login Success";
        }

        return "Invalid Credentials";
    }
}