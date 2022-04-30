package com.dlithe.bankingapp.serviceimpl;

import com.dlithe.bankingapp.dto.ReviewResponse;
import com.dlithe.bankingapp.dto.StudentDetailsResponse;
import com.dlithe.bankingapp.entity.StudentDetails;
import com.dlithe.bankingapp.repository.StudentDetailsDAO;
import com.dlithe.bankingapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDetailsDAO studentDetailsDAO;




    @Override
    public StudentDetailsResponse getStudentDetails(int studentId) {
        StudentDetailsResponse studentDetailsResponse = new StudentDetailsResponse();
        ReviewResponse reviewResponse = new ReviewResponse();
        ReviewResponse reviewResponse1 = new ReviewResponse();

        List<ReviewResponse> reviewResponseList = new ArrayList<>();

        Optional<StudentDetails> studentDetails = studentDetailsDAO.findById(studentId);
        StudentDetails student = studentDetails.get();

        studentDetailsResponse.setStudentName(student.getStudentName());
        studentDetailsResponse.setStudentMobile(student.getStudentMobile());
        studentDetailsResponse.setStudentRating(student.getStudentRating());


        reviewResponse.setReviewerName("adu");
        reviewResponse.setReview("it's good!");
        reviewResponse.setRating("4");
        reviewResponseList.add(reviewResponse);

        reviewResponse1.setReviewerName("yash");
        reviewResponse1.setReview("it's bad!");
        reviewResponse1.setRating("1");
        reviewResponseList.add(reviewResponse1);
        studentDetailsResponse.setReviewResponses(reviewResponseList);



//        studentDetailsResponse.setReview(reviewResponse);


        return studentDetailsResponse;
    }
}
