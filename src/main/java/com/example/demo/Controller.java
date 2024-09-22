package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String hello() {
        return "Hello world";
    }

    @GetMapping("/env")
    public String envvar() {
        String value_name = System.getEnv("TEST_CONN_STR");
        return value_name;
    }
}