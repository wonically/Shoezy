package com.wonically.shoezy.backend.model.mapper.user;

import com.wonically.shoezy.backend.entity.user.Permission;
import com.wonically.shoezy.backend.model.request.user.PermissionRequest;
import com.wonically.shoezy.backend.model.response.user.PermissionResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PermissionMapper {

    Permission toPermission(PermissionRequest permissionRequest);
    
    Permission toPermission(@MappingTarget Permission permission, PermissionRequest permissionRequest);
    
    PermissionResponse toPermissionResponse(Permission permission);
}
