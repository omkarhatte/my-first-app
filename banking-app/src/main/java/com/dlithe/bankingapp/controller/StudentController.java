package com.dlithe.bankingapp.controller;

import com.dlithe.bankingapp.dto.StudentDetailsResponse;
import com.dlithe.bankingapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping("get-student-details/{studentId}")
    public StudentDetailsResponse getStudentDetails(@PathVariable int studentId){

        return studentService.getStudentDetails(studentId);
    }

}
