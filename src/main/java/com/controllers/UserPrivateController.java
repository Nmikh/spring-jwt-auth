package com.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserPrivateController {
    @GetMapping("/private")
    public ResponseEntity getAllComments() {
        return new ResponseEntity("Hello, user", HttpStatus.OK);
    }


}
