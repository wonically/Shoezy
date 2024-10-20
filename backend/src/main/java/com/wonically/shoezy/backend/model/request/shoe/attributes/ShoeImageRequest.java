package com.wonically.shoezy.backend.model.request.shoe.attributes;

import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.net.URL;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShoeImageRequest {
    
    @NotBlank(message = "INVALID_URL")
    @org.hibernate.validator.constraints.URL(message = "INVALID_URL")
    URL imageUrl;
    
    @NotBlank(message = "INVALID_NAME")
    String imageName;
    
    String imageDescription;
    
    @NotBlank(message = "INVALID_CODE")
    String shoeCode;
    
}
