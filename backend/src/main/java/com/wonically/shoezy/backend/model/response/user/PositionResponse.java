package com.wonically.shoezy.backend.model.response.user;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Set;
import java.util.UUID;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PositionResponse {

    UUID positionID;

    String positionName;

    String department;

    Set<RoleResponse> role;
    
}
