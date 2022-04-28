package controller;

import dto.PatientDetailsRequest;
import org.springframework.web.bind.annotation.*;
import service.TestService;

@RestController
public class TestController {

    private TestService testService;

    @GetMapping("fetch-product-details/{productName}")
    public String firstMethod(@PathVariable String productName){
          String result =  testService.fetchProductDetails(productName);
          return result;

    }

    @PostMapping("register-patient")
    public String registerNewPatient(@RequestBody PatientDetailsRequest patientDetailsRequest){
        return testService.registerPatient(patientDetailsRequest);

    }
}
