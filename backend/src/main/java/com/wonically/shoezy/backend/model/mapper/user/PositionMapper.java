package com.wonically.shoezy.backend.model.mapper.user;

import com.wonically.shoezy.backend.entity.user.Position;
import com.wonically.shoezy.backend.entity.user.Role;
import com.wonically.shoezy.backend.model.request.user.PositionRequest;
import com.wonically.shoezy.backend.model.response.user.PositionResponse;
import com.wonically.shoezy.backend.model.response.user.RoleResponse;
import com.wonically.shoezy.backend.repository.RoleRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

@Mapper(componentModel = "spring")
public abstract class PositionMapper {
    
    @Autowired
    RoleRepository roleRepository;
    
    @Autowired
    RoleMapper roleMapper;
    
    @Mapping(target = "role", expression = "java(toRoles(positionRequest.getRole()))")
    public abstract Position toPosition(PositionRequest positionRequest);
    
    @Mapping(target = "role", expression = "java(toRoles(positionRequest.getRole()))")
    public abstract Position toPosition(@MappingTarget Position position, PositionRequest positionRequest);
    
    @Mapping(target = "role", expression = "java(toRoleResponses(position.getRole()))")
    public abstract PositionResponse toPositionResponse(Position position);
    
    public Set<Role> toRoles(Set<String> roleSet) {
        
        Set<Role> roles = new HashSet<>();
        for (String role : roleSet) {
            roles.add(roleRepository.findByRoleName(role));
        }
        return roles;
    }
    
    public Set<RoleResponse> toRoleResponses(Set<Role> roleSet) {
        
        Set<RoleResponse> roleResponses = new HashSet<>();
        for (Role role : roleSet) {
            roleResponses.add(roleMapper.toRoleResponse(role));
        }
        return roleResponses;
    }
    
}
