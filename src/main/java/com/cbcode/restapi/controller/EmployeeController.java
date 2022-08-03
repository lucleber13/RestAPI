package com.cbcode.restapi.controller;

import com.cbcode.restapi.entity.Employee;
import com.cbcode.restapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
<<<<<<< HEAD
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
=======
@CrossOrigin(origins = "*", allowedHeaders = "*")
>>>>>>> 09ace4d (Upadte and create new classes)
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
