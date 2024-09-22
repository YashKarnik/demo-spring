package com.example.demo;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String hello() {
        return "Hello world";
    }

    @GetMapping("/env")
    public Map<String, String> envvar() {
        Map<String, String> value_name = System.getenv();
        return value_name;
    }
}