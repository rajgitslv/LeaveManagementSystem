package com.leavemanagementsystem.LeaveManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "controller")
public class LeaveManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeaveManagementSystemApplication.class, args);
	}

}
