package com.wonically.shoezy.backend.repository;

import com.wonically.shoezy.backend.entity.shoe.attributes.ShoeTip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ShoeTipRepository extends JpaRepository<ShoeTip, UUID> {
    
    boolean existsByTipName(String tipName);
    
    ShoeTip findByTipName(String tipName);

}
