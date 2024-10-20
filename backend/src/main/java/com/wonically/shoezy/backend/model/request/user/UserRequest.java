package com.wonically.shoezy.backend.model.request.user;

import com.wonically.shoezy.backend.utils.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequest {
    
    @NotBlank(message = "INVALID_CODE")
    String code;
    
    @Password
    String password;
    
    @NotBlank(message = "INVALID_NAME")
    String name;
    
    @NotNull(message = "INVALID_DATE")
    LocalDate dateOfBirth;
    
    @NotBlank(message = "INVALID_GENDER")
    @ValidStatus(status = Gender.class, message = "INVALID_GENDER")
    String gender;
    
    @NotBlank(message = "INVALID_EMAIL")
    @Email
    String email;
    
    @PhoneNumber
    String phoneNumber;
    
    @NotBlank(message = "INVALID_STATUS")
    @ValidStatus(status = Status.class)
    String status;
    
}
