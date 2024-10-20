package com.wonically.shoezy.backend.repository;

import com.wonically.shoezy.backend.entity.shoe.attributes.ShoeInsole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ShoeInsoleRepository extends JpaRepository<ShoeInsole, UUID> {
    
    boolean existsByInsoleName(String insoleName);
    
    ShoeInsole findByInsoleName(String insoleName);

}
