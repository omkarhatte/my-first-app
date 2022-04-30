package com.dlithe.bankingapp.serviceimpl;

import com.dlithe.bankingapp.dto.TestDto;
import com.dlithe.bankingapp.dto.UserDetailsResponse;
import com.dlithe.bankingapp.entity.User;
import com.dlithe.bankingapp.repository.UserDAO;
import com.dlithe.bankingapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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
    public List<UserDetailsResponse> getUserDetails() {

        List<UserDetailsResponse> userDetailsResponseList = new ArrayList<>();

        List<User> userList = userDAO.findAll();

        for (User user : userList) {
            UserDetailsResponse userDetailsResponse = new UserDetailsResponse();
            userDetailsResponse.setUserName(user.getUserName());
            userDetailsResponse.setUserAge(user.getUserAge());
            userDetailsResponse.setId(user.getId());
            userDetailsResponseList.add(userDetailsResponse);

        }
        return userDetailsResponseList;

    }
}
