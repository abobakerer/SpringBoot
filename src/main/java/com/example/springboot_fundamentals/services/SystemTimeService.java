package com.example.springboot_fundamentals.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SystemTimeService implements TimeService {
    @Override
    public String getTime(){
        return "Time from SystemTimeService";
    }
}
