package com.wonically.shoezy.backend.repository;

import com.wonically.shoezy.backend.entity.user.StaffAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StaffAssignmentRepository extends JpaRepository<StaffAssignment, UUID> {
    
    boolean existsByAssignmentId(UUID assignmentId);
    
    StaffAssignment findByAssignmentId(UUID assignmentId);
    
    boolean existsByStaffCodeAndPositionPositionNameAndPositionDepartment(String staffCode, String positionName, String department);
    
    StaffAssignment findByStaffCodeAndPositionPositionNameAndPositionDepartment(String staffCode, String positionName, String department);

}
