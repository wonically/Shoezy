package com.wonically.shoezy.backend.repository;

import com.wonically.shoezy.backend.entity.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
    
    boolean existsByRoleName(String roleName);
    
    Role findByRoleName(String roleName);
    
}
