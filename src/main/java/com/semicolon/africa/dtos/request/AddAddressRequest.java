package com.semicolon.africa.dtos.request;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Setter
@Getter
public class AddAddressRequest {
    private String userId;
    
    private String firstName;
    
    private String middleName;
    
    private String lastName	;
    
    private String gender;
    
    private String birthday;
    
    private String company;
    
    private String address1;
    
    private String address2;
    
    private String cityOrTown;
    
    private String state;
    
    private String zipPostalCode;
    
    private String country;
    
    private String phone;
    
    private String email;
}
