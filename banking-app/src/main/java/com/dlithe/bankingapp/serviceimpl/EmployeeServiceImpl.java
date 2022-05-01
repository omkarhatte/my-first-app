package com.dlithe.bankingapp.serviceimpl;

import com.dlithe.bankingapp.dto.EmployeeDetails;

import com.dlithe.bankingapp.dto.EmployeeFeedback;
import com.dlithe.bankingapp.entity.Employee;
import com.dlithe.bankingapp.repository.EmployeeDetailsDAO;
import com.dlithe.bankingapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDetailsDAO employeeDetailsDAO;


    @Override
    public EmployeeDetails getEmployeeDetails(int empId) {
        EmployeeDetails employeeDetails = new EmployeeDetails();
        EmployeeFeedback employeeFeedback = new EmployeeFeedback();

        Optional<Employee> employee = employeeDetailsDAO.findById(empId);
        Employee employee1 = employee.get();

        employeeDetails.setId(employee1.getId());
        employeeDetails.setEmpName(employee1.getEmpName());
        employeeDetails.setEmpJob(employee1.getEmpJob());

        return employeeDetails;
    }
}
