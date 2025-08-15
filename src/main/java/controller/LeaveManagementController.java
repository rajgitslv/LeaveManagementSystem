package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/leaveManagement")
public class LeaveManagementController {

    public LeaveManagementController() {}

    @GetMapping
    public String about() {
        return "Leave Management System : 2025";
    }
}
