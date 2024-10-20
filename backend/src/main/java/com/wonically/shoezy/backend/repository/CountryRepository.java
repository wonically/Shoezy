package com.wonically.shoezy.backend.repository;

import com.wonically.shoezy.backend.entity.shoe.attributes.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CountryRepository extends JpaRepository<Country, UUID> {
    
    boolean existsByCountryCodeOrCountryName(String countryCode, String countryName);
    
    Country findByCountryCodeOrCountryName(String countryCode, String countryName);
    
    boolean existsByCountryCode(String countryCode);
    
    Country findByCountryCode(String countryCode);
    
    Country findByCountryName(String countryName);
    
}
