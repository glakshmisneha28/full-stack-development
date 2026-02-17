package com.example.optionaldependencydemo.component;

import org.springframework.stereotype.Component;

@Component   // Remove this to test "not present" case
public class ExtraService {

    public String getExtraInfo() {
        return "Extra Service is Available!";
    }
}
