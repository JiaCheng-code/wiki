package com.example.wiki.controller;

import com.example.wiki.domain.Test;
import com.example.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {
    @Value("${test.hello:Test}")
    private String testHello;

    @Resource
    private TestService testService;

    @GetMapping("/test")
    public String test() {
        return "Hello World"+testHello;
    }

    @PostMapping("/test/hello")
    public String testPost(String name) {
        return "Hello World"+name;
    }

    @GetMapping("/test/list")
    public List<Test> testList() {
        return testService.list();
    }

}
