package com.example.constructorinjection.controller;

import com.example.constructorinjection.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentService paymentService;

    // Constructor Injection
    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/pay/{amount}")
    public String pay(@PathVariable double amount) {
        return paymentService.processPayment(amount);
    }
}
