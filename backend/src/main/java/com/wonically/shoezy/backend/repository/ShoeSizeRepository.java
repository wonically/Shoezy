package com.wonically.shoezy.backend.repository;

import com.wonically.shoezy.backend.entity.shoe.attributes.ShoeSize;
import com.wonically.shoezy.backend.utils.SizingSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ShoeSizeRepository extends JpaRepository<ShoeSize, UUID> {
    
    boolean existsBySizeNumberAndSizingSystem(float sizeNumber, String sizingSystem);
    
    ShoeSize findBySizeNumberAndSizingSystem(float sizeNumber, String sizingSystem);

}
