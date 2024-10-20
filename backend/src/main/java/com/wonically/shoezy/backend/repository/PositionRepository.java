package com.wonically.shoezy.backend.repository;

import com.wonically.shoezy.backend.entity.user.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PositionRepository extends JpaRepository<Position, String> {
    
    boolean existsByPositionId(UUID positionId);
    
    Position findByPositionId(UUID positionId);
    
    boolean existsByPositionNameAndDepartment(String positionName, String department);
    
    Position findByPositionNameAndDepartment(String positionName, String department);

}
