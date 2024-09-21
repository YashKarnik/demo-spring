package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Annotation 
@RestController
// Main class
public class Controller {

    @GetMapping
    public String helloGFG() {
        return "Hello GeeksForGeeks";
    }
}