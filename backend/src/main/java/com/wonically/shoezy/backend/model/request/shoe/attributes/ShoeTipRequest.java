package com.wonically.shoezy.backend.model.request.shoe.attributes;

import com.wonically.shoezy.backend.utils.Status;
import com.wonically.shoezy.backend.utils.ValidStatus;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShoeTipRequest {
    
    @NotBlank(message = "INVALID_NAME")
    String tipName;
    
    @ValidStatus(status = Status.class)
    String tipStatus;
    
}
