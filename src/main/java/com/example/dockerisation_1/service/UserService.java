package com.example.dockerisation_1.service;

import com.example.dockerisation_1.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> getAllUsers() {
        return List.of(
                new User(1L, "Alice"),
                new User(2L, "Bob")
        );
    }

    public User getUserById(Long id) {
        return new User(id, "User" + id);
    }
}