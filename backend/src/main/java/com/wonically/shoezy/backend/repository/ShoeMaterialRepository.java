package com.wonically.shoezy.backend.repository;

import com.wonically.shoezy.backend.entity.shoe.attributes.ShoeMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ShoeMaterialRepository extends JpaRepository<ShoeMaterial, UUID> {
    
    boolean existsByMaterialName(String materialName);
    
    ShoeMaterial findByMaterialName(String materialName);
    
}
