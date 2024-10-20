package com.wonically.shoezy.backend.model.request.shoe.attributes;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShoeColorRequest {
    
    @NotBlank(message = "INVALID_CODE")
    @Pattern(regexp = "^#(?:(?:[\\da-f]{3}){1,2}|(?:[\\da-f]{4}){1,2})$")
    String colorCode;
    
    @NotBlank(message = "INVALID_NAME")
    String colorName;
    
}
