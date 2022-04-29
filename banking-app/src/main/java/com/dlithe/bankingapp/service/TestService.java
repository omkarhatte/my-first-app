package com.dlithe.bankingapp.service;

import com.dlithe.bankingapp.dto.TestDto;
import com.dlithe.bankingapp.dto.UserDetailsResponse;
import org.springframework.stereotype.Component;

@Component
public interface TestService {

    String registerCustomer(TestDto testDto);


    UserDetailsResponse getUserDetails(int userId);
}
