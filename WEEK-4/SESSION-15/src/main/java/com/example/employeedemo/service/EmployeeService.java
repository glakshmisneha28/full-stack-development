package com.example.employeedemo.service;

import com.example.employeedemo.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public Employee getEmployee() {

        return new Employee(
                101,
                "Sneha",
                "IT",
                45000.00
        );
    }
}
