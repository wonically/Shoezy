package com.wonically.shoezy.backend.repository;

import com.wonically.shoezy.backend.entity.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<Order, UUID> {
    
    boolean existsByOrderId(UUID orderId);
    
    Order findByOrderId(UUID orderId);

}
