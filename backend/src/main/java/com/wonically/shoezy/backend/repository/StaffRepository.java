package com.wonically.shoezy.backend.repository;

import com.wonically.shoezy.backend.entity.user.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StaffRepository extends JpaRepository<Staff, UUID> {
    
    boolean existsByCode(String code);
    
    Staff findByCode(String code);

}
