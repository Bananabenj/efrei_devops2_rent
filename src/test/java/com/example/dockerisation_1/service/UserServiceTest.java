package com.example.dockerisation_1.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    private final UserService service = new UserService();

    @Test
    void shouldReturnUsers() {
        assertEquals(2, service.getAllUsers().size());
    }

    @Test
    void shouldReturnUserById() {
        assertEquals("User1", service.getUserById(1L).getName());
    }
}