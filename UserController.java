package com.kurszeit.user.controller;

import com.kurszeit.user.model.User;
import com.kurszeit.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/find")
    public User getUserByEmail(@RequestParam String email) {
        return userService.getUserByEmail(email);
    }
}
