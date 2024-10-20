package com.wonically.shoezy.backend.controller;

import com.wonically.shoezy.backend.model.request.user.PermissionRequest;
import com.wonically.shoezy.backend.model.request.user.PositionRequest;
import com.wonically.shoezy.backend.model.request.user.RoleRequest;
import com.wonically.shoezy.backend.model.request.user.StaffAssignmentRequest;
import com.wonically.shoezy.backend.model.response.ApiResponse;
import com.wonically.shoezy.backend.service.AuthorizationService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/authorize")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthorizationController {
    
    @Autowired
    AuthorizationService authorizationService;
    
    @PostMapping("/permission/create")
    public ApiResponse createPermission(PermissionRequest permissionRequest) {
        
        return ApiResponse.builder()
                .result(authorizationService.createPermission(permissionRequest))
                .build();
    }
    
    @PutMapping("/permission/update/{permissionName}")
    public ApiResponse updatePermission(@PathVariable String permissionName, PermissionRequest permissionRequest) {
        
        return ApiResponse.builder()
                .result(authorizationService.updatePermission(permissionName, permissionRequest))
                .build();
    }
    
    @GetMapping("/permission/{permissionName}")
    public ApiResponse getPermission(@PathVariable String permissionName) {
        
        return ApiResponse.builder()
                .result(authorizationService.getPermission(permissionName))
                .build();
    }
    
    @GetMapping("/permissions")
    public ApiResponse getPermissions() {
        
        return ApiResponse.builder()
                .result(authorizationService.getPermissions())
                .build();
    }
    
    @PostMapping("/position/create")
    public ApiResponse createPosition(PositionRequest positionRequest) {
        
        return ApiResponse.builder()
                .result(authorizationService.createPosition(positionRequest))
                .build();
    }
    
    @PutMapping("/position/update/{positionId}")
    public ApiResponse updatePosition(@PathVariable UUID positionId, PositionRequest positionRequest) {
        
        return ApiResponse.builder()
                .result(authorizationService.updatePosition(positionId, positionRequest))
                .build();
    }
    
    @GetMapping("/position/{department}/{positionName}")
    public ApiResponse getPosition(@PathVariable String positionName, @PathVariable String department) {
        
        return ApiResponse.builder()
                .result(authorizationService.getPosition(positionName, department))
                .build();
    }
    
    @GetMapping("/positions")
    public ApiResponse getPositions() {
        
        return ApiResponse.builder()
                .result(authorizationService.getPositions())
                .build();
    }
    
    @PostMapping("/role/create")
    public ApiResponse createRole(RoleRequest roleRequest) {
        
        return ApiResponse.builder()
                .result(authorizationService.createRole(roleRequest))
                .build();
    }
    
    @PutMapping("/role/update/{roleName}")
    public ApiResponse updateRole(@PathVariable String roleName, RoleRequest roleRequest) {
        
        return ApiResponse.builder()
                .result(authorizationService.updateRole(roleName, roleRequest))
                .build();
    }
    
    @GetMapping("/role/{roleName}")
    public ApiResponse getRole(@PathVariable String roleName) {
        
        return ApiResponse.builder()
                .result(authorizationService.getRole(roleName))
                .build();
    }
    
    @GetMapping("/roles")
    public ApiResponse getRoles() {
        
        return ApiResponse.builder()
                .result(authorizationService.getRoles())
                .build();
    }
    
    @PostMapping("/staff-assignment/create")
    public ApiResponse createStaffAssignment(StaffAssignmentRequest staffAssignmentRequest) {
        
        return ApiResponse.builder()
                .result(authorizationService.createStaffAssignment(staffAssignmentRequest))
                .build();
    }
    
    @PutMapping("/staff-assignment/update/{assignmentId}")
    public ApiResponse updateStaffAssignment(@PathVariable UUID assignmentId, StaffAssignmentRequest staffAssignmentRequest) {
        
        return ApiResponse.builder()
                .result(authorizationService.updateStaffAssignment(assignmentId, staffAssignmentRequest))
                .build();
    }
    
    @GetMapping("/staff-assignment/{staffCode}/{positionName}/{department}")
    public ApiResponse getStaffAssignment(@PathVariable String staffCode, @PathVariable String positionName, @PathVariable String department) {
        
        return ApiResponse.builder()
                .result(authorizationService.getStaffAssignment(staffCode, positionName, department))
                .build();
    }
    
    @GetMapping("/staff-assignments")
    public ApiResponse getStaffAssignments() {
        
        return ApiResponse.builder()
                .result(authorizationService.getStaffAssignments())
                .build();
    }
    
}
