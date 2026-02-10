package com.example.constructorinjection.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public String processPayment(double amount) {
        return "Payment of ₹" + amount + " successful (Constructor Injection)";
    }
}
