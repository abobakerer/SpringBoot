package com.example.springboot_fundamentals.controller;

import com.example.springboot_fundamentals.services.TimeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {


    private final TimeService timeService;
    public TimeController(@Qualifier("mock") TimeService timeService){
        this.timeService = timeService;
    }

    @GetMapping("/time")
    public String getTime(){
        return timeService.getTime();
    }


}
