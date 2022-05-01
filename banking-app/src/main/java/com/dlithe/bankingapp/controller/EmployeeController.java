package com.dlithe.bankingapp.controller;

import com.dlithe.bankingapp.dto.EmployeeDetails;

import com.dlithe.bankingapp.dto.StudentDetailsResponse;
import com.dlithe.bankingapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;



    @GetMapping("get-employee-details/{empId}")
    public EmployeeDetails getEmployeeDetails(@PathVariable int empId){

        return employeeService.getEmployeeDetails(empId);
    }


}
