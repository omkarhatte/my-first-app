package com.dlithe.bankingapp.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@EqualsAndHashCode
public class UserDetailsResponse {

    private int id;
    private String userName;
    private int userAge;
}
