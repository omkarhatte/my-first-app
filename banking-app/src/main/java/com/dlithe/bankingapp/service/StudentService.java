package com.dlithe.bankingapp.service;

import com.dlithe.bankingapp.dto.StudentDetailsResponse;
import org.springframework.stereotype.Component;

@Component
public interface StudentService {




    StudentDetailsResponse getStudentDetails(int studentId);
}
