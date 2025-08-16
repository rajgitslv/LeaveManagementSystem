package com.controller;

import com.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
        Optional<Employee> employee = employeeService.getEmployeeById(employeeId);
        return employee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.createNewEmployee(employee);
    }

    @PutMapping("/employees/{employeeId}")
    public Employee updateEmployee(@PathVariable String employeeId, @RequestBody Employee employee) {
        return employeeService.updateEmployee(employeeId, employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployee(@PathVariable String employeeId) {
        employeeService.deleteEmployee(employeeId);
    }

}
