package com.dlithe.bankingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MappingController {

//    http://localhost:8080/test

    @GetMapping("test")
    public String firstController(){
        return "Hey guys!!! It's me,Springboot endpoint response";
    }
}
