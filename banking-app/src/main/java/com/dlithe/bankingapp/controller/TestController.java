package com.dlithe.bankingapp.controller;

import com.dlithe.bankingapp.dto.TestDto;
import com.dlithe.bankingapp.dto.UserDetailsResponse;
import com.dlithe.bankingapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {


    @Autowired
    private TestService testService;


    /*@PostMapping("register-customer")
    public String registerNewCustomer(@RequestBody TestDto testDto){
        return testService.registerCustomer(testDto);

    }*/

//    @GetMapping("get-users")
//    public List<UserDetailsResponse> getUserDetails(){
//        return testService.getUserDetails();
//
//    }

    @GetMapping("fetch-user-details/{userName}")
    public UserDetailsResponse fetchUserDetailsBasedUserName(@PathVariable String userName){
        return testService.fetchUserDetailsByUserName(userName);
    }
}
