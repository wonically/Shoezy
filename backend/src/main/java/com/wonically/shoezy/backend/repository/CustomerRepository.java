package com.wonically.shoezy.backend.repository;

import com.wonically.shoezy.backend.entity.user.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, UUID> {
    
    boolean existsByCode(String code);
    
    Customer findByCode(String code);
    
}
