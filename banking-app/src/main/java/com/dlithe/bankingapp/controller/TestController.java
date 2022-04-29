package com.dlithe.bankingapp.controller;

import com.dlithe.bankingapp.dto.TestDto;
import com.dlithe.bankingapp.dto.UserDetailsResponse;
import com.dlithe.bankingapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {


    @Autowired
    private TestService testService;


    /*@PostMapping("register-customer")
    public String registerNewCustomer(@RequestBody TestDto testDto){
        return testService.registerCustomer(testDto);

    }*/

    @GetMapping("get-user-details/{userId}")
    public UserDetailsResponse getUserDetails(@PathVariable int userId){
        return testService.getUserDetails(userId);

    }
}
