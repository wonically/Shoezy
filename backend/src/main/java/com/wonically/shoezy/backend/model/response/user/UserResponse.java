package com.wonically.shoezy.backend.model.response.user;

import com.wonically.shoezy.backend.utils.Status;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.UUID;

@SuperBuilder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {

    UUID id;
    
    String code;
    
    String password;
    
    String name;
    
    LocalDate dateOfBirth;
    
    String gender;
    
    String email;
    
    String phoneNumber;
    
    Status status;

}
