package com.wonically.shoezy.backend.model.mapper.user;

import com.wonically.shoezy.backend.entity.user.StaffAssignment;
import com.wonically.shoezy.backend.model.request.user.StaffAssignmentRequest;
import com.wonically.shoezy.backend.model.response.user.StaffAssignmentResponse;
import com.wonically.shoezy.backend.repository.PositionRepository;
import com.wonically.shoezy.backend.repository.StaffRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class StaffAssignmentMapper {
    
    @Autowired
    StaffRepository staffRepository;
    
    @Autowired
    StaffMapper staffMapper;
    
    @Autowired
    PositionRepository positionRepository;
    
    @Autowired
    PositionMapper positionMapper;
    
    @Mapping(target = "staff", expression = "java(staffRepository.findByCode(staffAssignmentRequest.getStaffCode()))")
    @Mapping(target = "position", expression = "java(positionRepository.findByPositionNameAndDepartment(staffAssignmentRequest.getPositionName(), staffAssignmentRequest.getDepartment()))")
    public abstract StaffAssignment toStaffAssignment(StaffAssignmentRequest staffAssignmentRequest);
    
    @Mapping(target = "staff", expression = "java(staffRepository.findByCode(staffAssignmentRequest.getStaffCode()))")
    @Mapping(target = "position", expression = "java(positionRepository.findByPositionNameAndDepartment(staffAssignmentRequest.getPositionName(), staffAssignmentRequest.getDepartment()))")
    public abstract StaffAssignment toStaffAssignment(@MappingTarget StaffAssignment staffAssignment, StaffAssignmentRequest staffAssignmentRequest);
    
    public abstract StaffAssignmentResponse toStaffAssignmentResponse(StaffAssignment staffAssignment);
    
}
