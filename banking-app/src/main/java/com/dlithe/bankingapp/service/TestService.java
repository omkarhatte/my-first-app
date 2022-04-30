package com.dlithe.bankingapp.service;

import com.dlithe.bankingapp.dto.TestDto;
import com.dlithe.bankingapp.dto.UserDetailsResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TestService {

    String registerCustomer(TestDto testDto);


    List<UserDetailsResponse> getUserDetails();

    UserDetailsResponse fetchUserDetailsByUserName(String userName);
}
