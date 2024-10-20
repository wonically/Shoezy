package com.wonically.shoezy.backend.model.response.user;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AddressResponse {
    
    UUID addressId;
    
    String recipientName;
    
    String recipientPhone;
    
    String addressLine1;
    
    String addressLine2;
    
    String city;
    
    String state;
    
    String province;
    
    String country;
    
    String zipCode;
    
}
