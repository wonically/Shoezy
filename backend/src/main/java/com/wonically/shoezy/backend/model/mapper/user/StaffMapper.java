package com.wonically.shoezy.backend.model.mapper.user;

import com.wonically.shoezy.backend.entity.user.Staff;
import com.wonically.shoezy.backend.model.request.user.StaffRequest;
import com.wonically.shoezy.backend.model.response.user.StaffResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface StaffMapper extends UserMapper {
    
    Staff toStaff(StaffRequest staffRequest);
    
    Staff toStaff(@MappingTarget Staff staff, StaffRequest staffRequest);
    
    StaffResponse toStaffResponse(Staff staff);

}
