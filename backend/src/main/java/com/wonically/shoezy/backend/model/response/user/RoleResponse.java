package com.wonically.shoezy.backend.model.response.user;

import com.wonically.shoezy.backend.utils.Status;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoleResponse {

    String roleName;
  
    String roleDescription;
    
    Status roleStatus;
    
    Set<PermissionResponse> permission;
    
}
