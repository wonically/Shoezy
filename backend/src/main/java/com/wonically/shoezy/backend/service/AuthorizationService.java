package com.wonically.shoezy.backend.service;

import com.wonically.shoezy.backend.exception.AppException;
import com.wonically.shoezy.backend.exception.ErrorCode;
import com.wonically.shoezy.backend.model.mapper.user.PermissionMapper;
import com.wonically.shoezy.backend.model.mapper.user.PositionMapper;
import com.wonically.shoezy.backend.model.mapper.user.RoleMapper;
import com.wonically.shoezy.backend.model.mapper.user.StaffAssignmentMapper;
import com.wonically.shoezy.backend.model.request.user.PermissionRequest;
import com.wonically.shoezy.backend.model.request.user.PositionRequest;
import com.wonically.shoezy.backend.model.request.user.RoleRequest;
import com.wonically.shoezy.backend.model.request.user.StaffAssignmentRequest;
import com.wonically.shoezy.backend.model.response.user.PermissionResponse;
import com.wonically.shoezy.backend.model.response.user.PositionResponse;
import com.wonically.shoezy.backend.model.response.user.RoleResponse;
import com.wonically.shoezy.backend.model.response.user.StaffAssignmentResponse;
import com.wonically.shoezy.backend.repository.PermissionRepository;
import com.wonically.shoezy.backend.repository.PositionRepository;
import com.wonically.shoezy.backend.repository.RoleRepository;
import com.wonically.shoezy.backend.repository.StaffAssignmentRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthorizationService {
    
    @Autowired
    PermissionRepository permissionRepository;
    
    @Autowired
    PermissionMapper permissionMapper;
    
    @Autowired
    PositionRepository positionRepository;
    
    @Autowired
    PositionMapper positionMapper;
    
    @Autowired
    RoleRepository roleRepository;
    
    @Autowired
    RoleMapper roleMapper;
    
    @Autowired
    StaffAssignmentRepository staffAssignmentRepository;
    
    @Autowired
    StaffAssignmentMapper staffAssignmentMapper;
    
    public PermissionResponse createPermission(PermissionRequest permissionRequest) {
        
        if (permissionRepository.existsByPermissionName(permissionRequest.getPermissionName())) {
            throw new AppException(ErrorCode.EXISTED);
        } else {
            return permissionMapper.toPermissionResponse(permissionRepository.save(permissionMapper.toPermission(permissionRequest)));
        }
    }
    
    public PermissionResponse updatePermission(String permissionName, PermissionRequest permissionRequest) {
        
        if (permissionRepository.existsByPermissionName(permissionName)) {
            return permissionMapper.toPermissionResponse(permissionRepository.save(permissionMapper.toPermission(permissionRepository.findByPermissionName(permissionName), permissionRequest)));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public PermissionResponse getPermission(String permissionName) {
        
        if (permissionRepository.existsByPermissionName(permissionName)) {
            return permissionMapper.toPermissionResponse(permissionRepository.findByPermissionName(permissionName));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public List<PermissionResponse> getPermissions() {
        
        return permissionRepository.findAll().stream().map(permissionMapper::toPermissionResponse).toList();
    }
    
    public PositionResponse createPosition(PositionRequest positionRequest) {
        
        if (positionRepository.existsByPositionNameAndDepartment(positionRequest.getPositionName(), positionRequest.getDepartment())) {
            throw new AppException(ErrorCode.EXISTED);
        } else {
            return positionMapper.toPositionResponse(positionRepository.save(positionMapper.toPosition(positionRequest)));
        }
    }
    
    public PositionResponse updatePosition(UUID positionId, PositionRequest positionRequest) {
        
        if (positionRepository.existsByPositionId(positionId)) {
            return positionMapper.toPositionResponse(positionRepository.save(positionMapper.toPosition(positionRepository.findByPositionId(positionId), positionRequest)));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public PositionResponse getPosition(String positionName, String department) {
        
        if (positionRepository.existsByPositionNameAndDepartment(positionName, department)) {
            return positionMapper.toPositionResponse(positionRepository.findByPositionNameAndDepartment(positionName, department));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public List<PositionResponse> getPositions() {
        
        return positionRepository.findAll().stream().map(positionMapper::toPositionResponse).toList();
    }
    
    public RoleResponse createRole(RoleRequest roleRequest) {
        
        if (roleRepository.existsByRoleName(roleRequest.getRoleName())) {
            throw new AppException(ErrorCode.EXISTED);
        } else {
            return roleMapper.toRoleResponse(roleRepository.save(roleMapper.toRole(roleRequest)));
        }
    }
    
    public RoleResponse updateRole(String roleName, RoleRequest roleRequest) {
        
        if (roleRepository.existsByRoleName(roleName)) {
            return roleMapper.toRoleResponse(roleRepository.save(roleMapper.toRole(roleRepository.findByRoleName(roleName), roleRequest)));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public RoleResponse getRole(String roleName) {
        
        if (roleRepository.existsByRoleName(roleName)) {
            return roleMapper.toRoleResponse(roleRepository.findByRoleName(roleName));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public List<RoleResponse> getRoles() {
        
        return roleRepository.findAll().stream().map(roleMapper::toRoleResponse).toList();
    }
    
    public StaffAssignmentResponse createStaffAssignment(StaffAssignmentRequest staffAssignmentRequest) {
        
        if (staffAssignmentRepository.existsByStaffCodeAndPositionPositionNameAndPositionDepartment(staffAssignmentRequest.getStaffCode(), staffAssignmentRequest.getPositionName(), staffAssignmentRequest.getDepartment())) {
            throw new AppException(ErrorCode.EXISTED);
        } else {
            return staffAssignmentMapper.toStaffAssignmentResponse(staffAssignmentRepository.save(staffAssignmentMapper.toStaffAssignment(staffAssignmentRequest)));
        }
    }
    
    public StaffAssignmentResponse updateStaffAssignment(UUID assignmentId, StaffAssignmentRequest staffAssignmentRequest) {
        
        if (staffAssignmentRepository.existsByAssignmentId(assignmentId)) {
            return staffAssignmentMapper.toStaffAssignmentResponse(staffAssignmentRepository.save(staffAssignmentMapper.toStaffAssignment(staffAssignmentRepository.findByAssignmentId(assignmentId), staffAssignmentRequest)));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public StaffAssignmentResponse getStaffAssignment(String staffCode, String positionName, String department) {
        
        if (staffAssignmentRepository.existsByStaffCodeAndPositionPositionNameAndPositionDepartment(staffCode, positionName, department)) {
            return staffAssignmentMapper.toStaffAssignmentResponse(staffAssignmentRepository.findByStaffCodeAndPositionPositionNameAndPositionDepartment(staffCode, positionName, department));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public List<StaffAssignmentResponse> getStaffAssignments() {
        
        return staffAssignmentRepository.findAll().stream().map(staffAssignmentMapper::toStaffAssignmentResponse).toList();
    }
    
}
