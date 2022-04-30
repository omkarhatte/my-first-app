package com.dlithe.bankingapp.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class StudentDetailsResponse {

    private int id;
    private String studentName;
    private String studentMobile;
    private int studentRating;


//    private ReviewResponse review;


    private List<ReviewResponse> reviewResponses;

}
