package com.controllers;

import com.models.UserEntity;
import com.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserPublicController {

    @Autowired
    UserService userService;

    @PostMapping("/public/register")
    public ResponseEntity registerUser(@RequestBody UserEntity user) {
        return new ResponseEntity(userService.registerNewUser(user), HttpStatus.OK);
    }

}
