package com.wonically.shoezy.backend.model.response.shoe.attributes;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.net.URL;
import java.util.UUID;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShoeImageResponse {

    UUID imageId;
    
    URL imageUrl;

    String imageName;

    String imageDescription;
    
    String shoeCode;
    
}
