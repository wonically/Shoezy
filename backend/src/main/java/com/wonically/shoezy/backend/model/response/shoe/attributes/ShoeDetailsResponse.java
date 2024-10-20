package com.wonically.shoezy.backend.model.response.shoe.attributes;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShoeDetailsResponse {

    UUID detailsId;
   
    String shoeCode;
 
    ShoeSizeResponse shoeSize;
    
    ShoeColorResponse shoeColor;

    float unitPrice;
    
    int stockQuantity;
    
    String detailsStatus;
    
}
