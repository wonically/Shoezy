package com.wonically.shoezy.backend.repository;

import com.wonically.shoezy.backend.entity.shoe.attributes.ShoeHeel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ShoeHeelRepository extends JpaRepository<ShoeHeel, UUID> {
    
    boolean existsByHeelName(String heelName);
    
    ShoeHeel findByHeelName(String heelName);
    
}
