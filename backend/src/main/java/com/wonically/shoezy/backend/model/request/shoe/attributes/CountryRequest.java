package com.wonically.shoezy.backend.model.request.shoe.attributes;

import com.wonically.shoezy.backend.utils.Status;
import com.wonically.shoezy.backend.utils.ValidStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CountryRequest {
    
    @NotBlank(message = "INVALID_CODE")
    @Pattern(regexp = "^[A-Z]{2}$", message = "INVALID_CODE")
    String countryCode;
    
    @ValidStatus(status = Status.class)
    String countryStatus;
    
}
