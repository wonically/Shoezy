package com.wonically.shoezy.backend.model.request.shoe.attributes;

import com.wonically.shoezy.backend.utils.SizingSystem;
import com.wonically.shoezy.backend.utils.ValidStatus;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShoeSizeRequest {
    
    @NotNull(message = "INVALID_NUMBER")
    float sizeNumber;
    
    @ValidStatus(status = SizingSystem.class, message = "INVALID_SIZING_SYSTEM")
    String sizingSystem;
    
    @NotNull(message = "INVALID_LENGTH")
    float footLength;
    
    @NotNull(message = "INVALID_HEIGHT")
    float footWidth;
    
}
