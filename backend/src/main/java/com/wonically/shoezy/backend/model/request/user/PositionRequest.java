package com.wonically.shoezy.backend.model.request.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PositionRequest {
    
    @NotBlank(message = "INVALID_POSITION")
    String positionName;
    
    @NotBlank(message = "INVALID_DEPARTMENT")
    String department;
    
    @NotEmpty(message = "INVALID_ROLE")
    Set<String> role;
    
}
