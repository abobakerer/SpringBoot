package com.example.springboot_fundamentals.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("mock")
public class MockTimeService implements TimeService{
    @Override
    public String getTime(){
        return "Time from MockTimeService";
    }
}
