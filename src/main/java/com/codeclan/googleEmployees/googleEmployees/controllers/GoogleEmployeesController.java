package com.codeclan.googleEmployees.googleEmployees.controllers;


import com.codeclan.googleEmployees.googleEmployees.models.Employee;
import com.codeclan.googleEmployees.googleEmployees.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/google-employees")
public class GoogleEmployeesController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
