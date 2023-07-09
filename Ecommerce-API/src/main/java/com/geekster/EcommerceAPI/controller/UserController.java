package com.geekster.EcommerceAPI.controller;

import com.geekster.EcommerceAPI.model.User;
import com.geekster.EcommerceAPI.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("user")
    public String addUser(@RequestBody @Valid User user){
        return userService.addUser(user);
    }

    @GetMapping("user/{id}")
    public User getUserById(@PathVariable Integer userId){
        return userService.getUserById(userId);}
}
