package com.example.employeedemo.controller;

import com.example.employeedemo.model.Employee;
import com.example.employeedemo.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public String getEmployee(Model model) {

        Employee emp = employeeService.getEmployee();

        model.addAttribute("employee", emp);

        return "employee";
    }
}
