package com.wonically.shoezy.backend.model.request.user;

import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AddressRequest {

    @NotBlank(message = "INVALID_ADDRESS")
    String recipientName;

    @NotBlank(message = "INVALID_ADDRESS")
    String recipientPhone;

    @NotBlank(message = "INVALID_ADDRESS")
    String addressLine1;
    
    String addressLine2;

    @NotBlank(message = "INVALID_ADDRESS")
    String city;

    String state;
    
    String province;

    @NotBlank(message = "INVALID_ADDRESS")
    String country;

    @NotBlank(message = "INVALID_ADDRESS")
    String zipCode;

    @NotBlank(message = "INVALID_CUSTOMER")
    String customerCode;
    
}
