package com.wonically.shoezy.backend.model.request.user;

import com.wonically.shoezy.backend.utils.Status;
import com.wonically.shoezy.backend.utils.ValidStatus;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PermissionRequest {
    
    @NotBlank(message = "INVALID_PERMISSION")
    String permissionName;
    
    String permissionDescription;
    
    @ValidStatus(status = Status.class)
    String permissionStatus;
    
}
