package com.example.fieldinjection.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greet() {
        return "Hello from GreetingService (Field Injection)";
    }
}
