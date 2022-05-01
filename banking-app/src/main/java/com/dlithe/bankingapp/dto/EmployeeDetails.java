package com.dlithe.bankingapp.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class EmployeeDetails {

    private int id;
    private String empName;
    private String empJob;


    private EmployeeFeedback employeeFeedback;

}
