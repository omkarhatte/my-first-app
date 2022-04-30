package com.dlithe.bankingapp.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@ToString
public class StudentDetails {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;


    @Column(name = "student_name")
    private String studentName;


    @Column(name = "student_mobile")
    private String studentMobile;


    @Column(name = "student_rating")
    private int studentRating;
}
