package com.learning.tests.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class GeneralController {

    @GetMapping("/hello")
    public String greet(@RequestParam(defaultValue = "testing") String name) {
        return "Hello " + name;
    }
}