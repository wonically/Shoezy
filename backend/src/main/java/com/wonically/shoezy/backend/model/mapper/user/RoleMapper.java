package com.wonically.shoezy.backend.model.mapper.user;

import com.wonically.shoezy.backend.entity.user.Permission;
import com.wonically.shoezy.backend.entity.user.Role;
import com.wonically.shoezy.backend.model.request.user.RoleRequest;
import com.wonically.shoezy.backend.model.response.user.PermissionResponse;
import com.wonically.shoezy.backend.model.response.user.RoleResponse;
import com.wonically.shoezy.backend.repository.PermissionRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

@Mapper(componentModel = "spring")
public abstract class RoleMapper {
    
    @Autowired
    PermissionRepository permissionRepository;
    
    @Autowired
    PermissionMapper permissionMapper;
    
    @Mapping(target = "permission", expression = "java(toPermissions(roleRequest.getPermission()))")
    public abstract Role toRole(RoleRequest roleRequest);
    
    @Mapping(target = "permission", expression = "java(toPermissions(roleRequest.getPermission()))")
    public abstract Role toRole(@MappingTarget Role role, RoleRequest roleRequest);
    
    @Mapping(target = "permission", expression = "java(toPermissionResponses(role.getPermission()))")
    public abstract RoleResponse toRoleResponse(Role role);
    
    public Set<Permission> toPermissions(Set<String> permissionSet) {
        
        Set<Permission> permissions = new HashSet<>();
        for (String permission : permissionSet) {
            permissions.add(permissionRepository.findByPermissionName(permission));
        }
        return permissions;
    }
    
    public Set<PermissionResponse> toPermissionResponses(Set<Permission> permissionSet) {
        
        Set<PermissionResponse> permissionResponses = new HashSet<>();
        for (Permission permission : permissionSet) {
            permissionResponses.add(permissionMapper.toPermissionResponse(permission));
        }
        return permissionResponses;
    }

}
