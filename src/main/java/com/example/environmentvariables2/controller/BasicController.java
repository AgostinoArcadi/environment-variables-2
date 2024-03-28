package com.example.environmentvariables2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic")
public class BasicController {

    @Autowired
    private Environment environment;

    @GetMapping
    public ResponseEntity<String> nameCode() {
        String welcome = environment.getProperty("welcomeMsg");
        return ResponseEntity.ok().body(welcome);
    }
}
