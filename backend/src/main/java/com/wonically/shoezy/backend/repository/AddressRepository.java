package com.wonically.shoezy.backend.repository;

import com.wonically.shoezy.backend.entity.user.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AddressRepository extends JpaRepository<Address, UUID> {
    
    boolean existsByAddressId(UUID addressId);
    
    Address findByAddressId(UUID addressId);
    
    void deleteByAddressId(UUID addressId);
    
}
