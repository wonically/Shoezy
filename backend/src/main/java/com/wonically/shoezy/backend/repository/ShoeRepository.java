package com.wonically.shoezy.backend.repository;

import com.wonically.shoezy.backend.entity.shoe.Shoe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ShoeRepository extends JpaRepository<Shoe, UUID> {
    
    boolean existsByShoeCode(String shoeCode);
    
    Shoe findByShoeCode(String shoeCode);

}
