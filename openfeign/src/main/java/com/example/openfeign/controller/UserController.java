package com.example.openfeign.controller;

import com.example.openfeign.domin.User;
import com.example.openfeign.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/openfeign")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> users(){
        return userService.user();
    }
}
