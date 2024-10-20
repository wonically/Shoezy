package com.wonically.shoezy.backend.repository;

import com.wonically.shoezy.backend.entity.shoe.attributes.ShoeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ShoeDetailsRepository extends JpaRepository<ShoeDetails, UUID> {
    
    boolean existsByDetailsId(UUID detailsId);
    
    ShoeDetails findByDetailsId(UUID detailsId);
    
    boolean existsByShoeShoeCodeAndShoeSizeSizeNumberAndShoeSizeSizingSystemAndShoeColorColorCode(String shoeCode, float sizeNumber, String sizingSystem, String colorCode);
    
    ShoeDetails findByShoeShoeCodeAndShoeSizeSizeNumberAndShoeSizeSizingSystemAndShoeColorColorCode(String shoeCode, float sizeNumber, String sizingSystem, String colorCode);

}
