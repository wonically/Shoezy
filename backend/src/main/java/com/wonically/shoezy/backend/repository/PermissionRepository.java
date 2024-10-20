package com.wonically.shoezy.backend.repository;

import com.wonically.shoezy.backend.entity.user.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, String> {
    
    boolean existsByPermissionName(String permissionName);
    
    Permission findByPermissionName(String permissionName);

}
