package com.wonically.shoezy.backend.model.response.user;

import com.wonically.shoezy.backend.utils.Status;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PermissionResponse {

    String permissionName;
    
    String permissionDescription;
    
    Status permissionStatus;
    
}
