package com.dlithe.bankingapp.service;

import com.dlithe.bankingapp.dto.EmployeeDetails;

import org.springframework.stereotype.Component;

@Component
public interface EmployeeService {
    EmployeeDetails getEmployeeDetails(int empId);
}
