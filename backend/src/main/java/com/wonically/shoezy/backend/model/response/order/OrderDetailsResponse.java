package com.wonically.shoezy.backend.model.response.order;

import com.wonically.shoezy.backend.model.response.shoe.attributes.ShoeDetailsResponse;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDetailsResponse {
    
    UUID orderDetailsId;
    
    ShoeDetailsResponse shoeDetails;
    
    int quantity;
    
    float totalItemPrice;
    
}
