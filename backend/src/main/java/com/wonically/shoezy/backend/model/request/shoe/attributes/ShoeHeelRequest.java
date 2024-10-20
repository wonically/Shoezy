package com.wonically.shoezy.backend.model.request.shoe.attributes;

import com.wonically.shoezy.backend.utils.Status;
import com.wonically.shoezy.backend.utils.ValidStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShoeHeelRequest {
    
    @NotBlank(message = "INVALID_NAME")
    String heelName;
    
    @NotNull(message = "INVALID_HEIGHT")
    float heelHeight;
    
    @ValidStatus(status = Status.class)
    String heelStatus;
    
}
