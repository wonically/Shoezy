package com.wonically.shoezy.backend.repository;

import com.wonically.shoezy.backend.entity.shoe.attributes.ShoeImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.net.URL;
import java.util.UUID;

@Repository
public interface ShoeImageRepository extends JpaRepository<ShoeImage, UUID> {
    
    boolean existsByImageId(UUID imageId);
    
    ShoeImage findByImageId(UUID imageId);
    
    boolean existsByImageUrl(URL imageUrl);
    
    ShoeImage findByImageUrl(URL imageUrl);

}
