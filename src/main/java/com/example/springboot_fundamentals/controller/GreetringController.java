package com.example.springboot_fundamentals.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetringController {

    @GetMapping
    public String greeting(){
        return "Hello, SpringBoot!";
    }
}
