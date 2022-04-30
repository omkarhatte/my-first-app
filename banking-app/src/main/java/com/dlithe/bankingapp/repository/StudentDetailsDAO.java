package com.dlithe.bankingapp.repository;

import com.dlithe.bankingapp.entity.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDetailsDAO extends JpaRepository<StudentDetails,Integer> {
}
