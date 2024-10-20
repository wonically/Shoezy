package com.wonically.shoezy.backend.model.request.user;

import com.wonically.shoezy.backend.utils.Status;
import com.wonically.shoezy.backend.utils.ValidStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StaffAssignmentRequest {
    
    @NotBlank(message = "INVALID_CODE")
    String staffCode;
    
    @NotBlank(message = "INVALID_POSITION")
    String positionName;
    
    @NotBlank(message = "INVALID_DEPARTMENT")
    String department;
    
    @NotNull(message = "INVALID_DATE")
    LocalDate startDate;
    
    LocalDate endDate;
    
    @ValidStatus(status = Status.class)
    String status;
    
}
