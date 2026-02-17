package com.example.notificationdemo.controller;

import com.example.notificationdemo.service.NotificationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    private final NotificationService emailService;
    private final NotificationService smsService;

    @Autowired
    public NotificationController(
            @Qualifier("emailService") NotificationService emailService,
            @Qualifier("smsService") NotificationService smsService) {

        this.emailService = emailService;
        this.smsService = smsService;
    }

    @GetMapping("/send-email")
    public String sendEmail() {
        emailService.sendNotification("Hello via Email!");
        return "Email Notification Sent";
    }

    @GetMapping("/send-sms")
    public String sendSMS() {
        smsService.sendNotification("Hello via SMS!");
        return "SMS Notification Sent";
    }
}
