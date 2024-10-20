package com.wonically.shoezy.backend.model.request.shoe;

import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShoeRequest {
    
    @NotBlank(message = "INVALID_CODE")
    String shoeCode;
    
    @NotBlank(message = "INVALID_NAME")
    String shoeName;
    
    String shoeDescription;
    
    @NotBlank(message = "INVALID_NAME")
    String countryCode;
    
    @NotBlank(message = "INVALID_NAME")
    String factoryName;
    
    @NotBlank(message = "INVALID_NAME")
    String heelName;
    
    @NotBlank(message = "INVALID_NAME")
    String insoleName;
    
    @NotBlank(message = "INVALID_NAME")
    String materialName;
    
    @NotBlank(message = "INVALID_NAME")
    String tipName;
    
    @NotBlank(message = "INVALID_NAME")
    String zipperName;
    
}
