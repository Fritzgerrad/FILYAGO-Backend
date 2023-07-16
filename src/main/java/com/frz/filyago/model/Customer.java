package com.frz.filyago.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private Long id;
    private String firstname;
    private String lastname;
    private char gender;
    private String dateOfBirth;
    private double height;
    private String address;
    private String username;
    private String email;
    private String phoneNumber;
    private String discount;
    private Measurement measurement;


}


