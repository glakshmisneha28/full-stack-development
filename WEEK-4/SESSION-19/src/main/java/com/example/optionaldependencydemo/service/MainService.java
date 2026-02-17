package com.example.optionaldependencydemo.service;

import com.example.optionaldependencydemo.component.ExtraService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    @Autowired(required = false)
    private ExtraService extraService;

    public String process() {

        if (extraService != null) {
            return "Main Service + " + extraService.getExtraInfo();
        } else {
            return "Main Service (Extra Service Not Available)";
        }
    }
}
