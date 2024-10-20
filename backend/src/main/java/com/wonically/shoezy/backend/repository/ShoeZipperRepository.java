package com.wonically.shoezy.backend.repository;

import com.wonically.shoezy.backend.entity.shoe.attributes.ShoeZipper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ShoeZipperRepository extends JpaRepository<ShoeZipper, UUID> {
    
    boolean existsByZipperName(String zipperName);
    
    ShoeZipper findByZipperName(String zipperName);

}
