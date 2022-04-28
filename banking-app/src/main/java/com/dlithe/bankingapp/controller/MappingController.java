package com.dlithe.bankingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MappingController {

//    http://localhost:8080/test

    //
    @GetMapping("test")
    public String firstController() {
        return "Hey guys!!! It's me,Springboot endpoint response";
    }


    //PATH VARIABLES
    //http://localhost:8080/fetch-product-details/{productName}
    @GetMapping("fetch-product-details/{productName}")
    public String secondController(@PathVariable String productName) {

        switch (productName) {
            case "iphone":
                return mobileDetails();
            case "titanWatch":
                return titanWatchDetails();
            case "miPowerbank":
                return miPowerankDetails();
            default:
                return "no product found!!!";
        }

    }

    private String miPowerankDetails() {
        return "mi powerbank is the much better";
    }

    private String titanWatchDetails() {
        return "limited edition";
    }

    private String mobileDetails() {
        return "iphone 13 it's launch with some additional features";
    }


    @GetMapping("zoomcar-car/{carName}")
    public String thirdController(@PathVariable String carName) {

        switch (carName) {
            case "swift":
                return swiftDetails();
            case "ecoSport":
                return ecoSportDetails();
            case "creta":
                return cretaDetails();
            case "polo":
                return poloDetails();
            default:
                return "no car available!!!";
        }

    }

    private String poloDetails() {
        return "polo emi--> 22k/mon";
    }

    private String cretaDetails() {
        return "creta emi---> 28k/mon";
    }

    private String ecoSportDetails() {
        return "ecoSport emi--> 25k/mon";
    }

    private String swiftDetails() {
        return "swift emi---> 20k/mon";
    }






}


