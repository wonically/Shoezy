package com.wonically.shoezy.backend.repository;

import com.wonically.shoezy.backend.entity.shoe.attributes.ShoeColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoeColorRepository extends JpaRepository<ShoeColor, String> {
    
    boolean existsByColorCode(String colorCode);
    
    ShoeColor findByColorCode(String colorCode);

}
