package com.controller;

import com.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.repository.EmployeeRepository;
import com.services.EmployeeService;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/leaveManagement")
public class LeaveManagementController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public String about() {
        return "Leave Management System : 2025 ";
    }

    @GetMapping("/employees")
    public @ResponseBody Iterable<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{employeeId}")
    public Optional<Employee> getEmployeeById(@PathVariable String employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }

}
