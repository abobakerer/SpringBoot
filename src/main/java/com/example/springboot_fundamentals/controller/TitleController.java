package com.example.springboot_fundamentals.controller;

import com.example.springboot_fundamentals.AppProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TitleController {

    private final AppProperties appProperties;
    public TitleController(AppProperties appProperties){
        this.appProperties = appProperties;
    }

    @GetMapping("/title")
    public String getTitle(){
        return appProperties.getTitle();
    }

}
