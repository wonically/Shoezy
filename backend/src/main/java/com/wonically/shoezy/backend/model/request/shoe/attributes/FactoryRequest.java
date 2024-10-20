package com.wonically.shoezy.backend.model.request.shoe.attributes;

import com.wonically.shoezy.backend.utils.Status;
import com.wonically.shoezy.backend.utils.ValidStatus;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FactoryRequest {
    
    @NotBlank(message = "INVALID_NAME")
    String factoryName;
    
    @NotBlank(message = "INVALID_ADDRESS")
    String factoryAddress;
    
    @ValidStatus(status = Status.class)
    String factoryStatus;
    
}
