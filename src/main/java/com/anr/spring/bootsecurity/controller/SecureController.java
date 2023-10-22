package com.anr.spring.bootsecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
public class SecureController {


    @GetMapping
    public ResponseEntity<String> test(){
        return ResponseEntity.ok().body("secure service authenticated");
    }
}
