package com.example.optionaldependencydemo.controller;

import com.example.optionaldependencydemo.service.MainService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private MainService mainService;

    @GetMapping("/test")
    public String test() {
        return mainService.process();
    }
}
