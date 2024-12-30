package com.jwt.springboot.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.jwt.springboot.models.User;
import com.jwt.springboot.services.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;
    
    @GetExchange("/users")
    public List<User> getUser(){
        return userService.getUsers();
    }

    @GetMapping("/user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}
