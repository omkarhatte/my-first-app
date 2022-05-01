package com.dlithe.bankingapp.repository;

import com.dlithe.bankingapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDetailsDAO extends JpaRepository<Employee,Integer> {
}
