package com.wonically.shoezy.backend.model.request.user;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerRequest extends UserRequest {
    
    float totalSpending;
    
    int totalOrders;
    
}
