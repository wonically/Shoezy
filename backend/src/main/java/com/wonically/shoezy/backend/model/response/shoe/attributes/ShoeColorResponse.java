package com.wonically.shoezy.backend.model.response.shoe.attributes;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShoeColorResponse {

    String colorCode;
    
    String colorName;
    
}
