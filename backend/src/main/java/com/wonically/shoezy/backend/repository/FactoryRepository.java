package com.wonically.shoezy.backend.repository;

import com.wonically.shoezy.backend.entity.shoe.attributes.Factory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FactoryRepository extends JpaRepository<Factory, UUID> {
    
    boolean existsByFactoryName(String factoryName);
    
    Factory findByFactoryName(String factoryName);
    
}
