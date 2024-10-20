package com.wonically.shoezy.backend.model.response.user;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@SuperBuilder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerResponse extends UserResponse {
    
    float totalSpending;
    
    int totalOrders;
    
    Set<RoleResponse> role;
    
    Set<AddressResponse> address;
    
}
