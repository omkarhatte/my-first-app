package com.dlithe.bankingapp.serviceimpl;

import com.dlithe.bankingapp.dto.TestDto;
import com.dlithe.bankingapp.dto.UserDetailsResponse;
import com.dlithe.bankingapp.entity.User;
import com.dlithe.bankingapp.repository.UserDAO;
import com.dlithe.bankingapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TestServiceImpl implements TestService {


    @Autowired
    private UserDAO userDAO;


    @Override
    public String registerCustomer(TestDto testDto) {
        return null;
    }

    @Override
    public UserDetailsResponse getUserDetails(int userId) {
       Optional<User> user = userDAO.findById(userId);
       if(!user.isPresent()){
           throw new NullPointerException("User not found!!");
       }
       User userDetails = user.get();

       UserDetailsResponse userDetailsResponse = new UserDetailsResponse();
       userDetailsResponse.setUserName(userDetails.getUserName());
       userDetailsResponse.setUserAge(userDetails.getUserAge());
       userDetailsResponse.setId(userDetails.getId());

       return userDetailsResponse;

    }
}
