package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")

public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // REGISTER API
    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {

        return userRepository.save(user);
    }

    // LOGIN API
    @PostMapping("/login")
    public String loginUser(@RequestBody User user) {

        User existingUser =
                userRepository.findByEmail(user.getEmail());

        if (existingUser == null) {
            return "User not found";
        }

        if (existingUser.getPassword()
                .equals(user.getPassword())) {

            return "Login Successful";
        } else {
            return "Invalid Password";
        }
    }
}