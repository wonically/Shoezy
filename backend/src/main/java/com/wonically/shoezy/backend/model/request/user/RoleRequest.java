package com.wonically.shoezy.backend.model.request.user;

import com.wonically.shoezy.backend.utils.Status;
import com.wonically.shoezy.backend.utils.ValidStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoleRequest {
    
    @NotBlank(message = "INVALID_ROLE")
    String roleName;
    
    String roleDescription;
    
    @ValidStatus(status = Status.class)
    String roleStatus;
    
    @NotEmpty(message = "INVALID_PERMISSION")
    Set<String> permission;
    
}
