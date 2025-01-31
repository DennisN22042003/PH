package com.example.user_service.Services;

import java.util.*;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.user_service.model.User;

// FOR USE WHEN INTER-SERVICE COMMUNICATION AND DATABASE COMMUNICATION ARE IMPLEMENTED

// import com.example.user_service.exceptions.UserNotFoundException;
// import com.example.user_service.Repositories.UserRepository;

@Service
@Component
public class UserService {
    // private final UserRepository userRepository;

    private final List<User> users = Arrays.asList(
        // Sample data for testing
        new User(1L, "User A", "userA@gmail.com", "strongPassword", "Nairobi", "0712345678"),
        new User(2L, "User B", "userB@gmail.com", "otherStrongPassword", "Mombasa", "0798765432")
    );

    public List<User> getAllUsers() {
        return users;
    }

    public Optional<User> getUserById(Long id) {
        return users.stream().filter(b -> b.getId().equals(id)).findFirst();
    }
}