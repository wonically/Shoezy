package com.wonically.shoezy.backend.model.response.user;

import com.wonically.shoezy.backend.utils.Status;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StaffAssignmentResponse {
    
    UUID assignmentId;
    
    StaffResponse staff;
    
    PositionResponse position;
    
    LocalDate startDate;
    
    LocalDate endDate;
    
    Status status;
    
}
