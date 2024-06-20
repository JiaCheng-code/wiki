package com.example.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {
    @Value("${test.hello:Test}")
    private String testHello;

    @GetMapping("/test")
    public String test() {
        return "Hello World"+testHello;
    }

    @PostMapping("/test/hello")
    public String testPost(String name) {
        return "Hello World"+name;
    }
}
