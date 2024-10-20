package com.wonically.shoezy.backend.model.response.order;

import com.wonically.shoezy.backend.model.response.user.CustomerResponse;
import com.wonically.shoezy.backend.model.response.user.StaffResponse;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderResponse {
    
    UUID orderId;
    
    CustomerResponse customer;
    
    StaffResponse staff;
    
    Instant orderTime;
    
    Instant paymentTime;
    
    Instant paymentMethod;
    
    String paymentStatus;
    
    Instant deliveryDate;
    
    float deliveryFee;
    
    Instant finishDate;
    
    String orderStatus;
    
    float totalPrice;
    
    Set<OrderDetailsResponse> orderDetails;
    
}
