package com.example.springboot_fundamentals.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface TimeService {
    public String getTime();
}
