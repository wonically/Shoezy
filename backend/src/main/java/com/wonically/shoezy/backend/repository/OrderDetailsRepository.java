package com.wonically.shoezy.backend.repository;

import com.wonically.shoezy.backend.entity.order.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, UUID> {
    
    boolean existsByOrderDetailsId(UUID orderDetailsId);
    
    OrderDetails findByOrderDetailsId(UUID orderDetailsId);
    
    boolean existsByOrderOrderIdAndShoeDetailsDetailsId(UUID orderId, UUID shoeDetailsId);

}
