package com.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EMPLOYEE_ID", nullable = false)
    private String employeeId;

    @Column(name = "EMPLOYEE_NAME", nullable = false)
    private String employeeName;

    @Column(name = "EMPLOYEE_EMAIL_ID", nullable = false)
    private String employeeEmailId;

    @Column(name = "GENDER", nullable = false)
    private String gender;

    @Column(name = "EMPLOYEE_ADDRESS", nullable = true)
    private String employeeAddress;

    @Column(name = "DATE_OF_BIRTH", nullable = true)
    private LocalDate dateOfBirth;

    @Column(name = "EMPLOYEE_SALARY", nullable = false)
    private String employeeSalary;

    @Column(name = "DATE_OF_JOINING", nullable = false)
    private LocalDate dateOfJoining;

    @Column(name = "DATE_OF_LEAVING", nullable = true)
    private LocalDate dateOfLeaving;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public LocalDate getDateOfLeaving() {
        return dateOfLeaving;
    }

    public void setDateOfLeaving(LocalDate dateOfLeaving) {
        this.dateOfLeaving = dateOfLeaving;
    }
}
