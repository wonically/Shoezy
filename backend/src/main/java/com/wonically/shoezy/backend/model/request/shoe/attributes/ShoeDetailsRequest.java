package com.wonically.shoezy.backend.model.request.shoe.attributes;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShoeDetailsRequest {
    
    String shoeCode;
    
    float sizeNumber;
    
    String sizingSystem;
    
    String colorCode;
    
    float unitPrice;
    
    int stockQuantity;
    
    String detailsStatus;
    
}
