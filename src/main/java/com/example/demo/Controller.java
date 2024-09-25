package com.example.demo;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String hello() {
        return "Hello world - v1 ";
    }

    @GetMapping("/env")
    public String envvar() {
        String value_name = System.getenv("CUSTOMCONNSTR_TEST_CONN_STR");
        return value_name;
    }
}