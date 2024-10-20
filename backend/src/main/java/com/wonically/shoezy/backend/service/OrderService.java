package com.wonically.shoezy.backend.service;

import com.wonically.shoezy.backend.exception.AppException;
import com.wonically.shoezy.backend.exception.ErrorCode;
import com.wonically.shoezy.backend.model.mapper.order.OrderDetailsMapper;
import com.wonically.shoezy.backend.model.mapper.order.OrderMapper;
import com.wonically.shoezy.backend.model.request.order.OrderDetailsRequest;
import com.wonically.shoezy.backend.model.request.order.OrderRequest;
import com.wonically.shoezy.backend.model.response.order.OrderDetailsResponse;
import com.wonically.shoezy.backend.model.response.order.OrderResponse;
import com.wonically.shoezy.backend.repository.OrderDetailsRepository;
import com.wonically.shoezy.backend.repository.OrderRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class OrderService {
    
    @Autowired
    OrderRepository orderRepository;
    
    @Autowired
    OrderMapper orderMapper;
    
    @Autowired
    OrderDetailsRepository orderDetailsRepository;
    
    @Autowired
    OrderDetailsMapper orderDetailsMapper;
    
    public OrderResponse createOrder(OrderRequest orderRequest) {
        
        return orderMapper.toOrderResponse(orderRepository.save(orderMapper.toOrder(orderRequest)));
    }
    
    public OrderResponse updateOrder(UUID orderId, OrderRequest orderRequest) {
        
        if (orderRepository.existsByOrderId(orderId)) {
            return orderMapper.toOrderResponse(orderRepository.save(orderMapper.toOrder(orderRepository.findByOrderId(orderId), orderRequest)));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public OrderResponse getOrder(UUID orderId) {
        
        if (orderRepository.existsByOrderId(orderId)) {
            return orderMapper.toOrderResponse(orderRepository.findByOrderId(orderId));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public List<OrderResponse> getOrders() {
        
        return orderRepository.findAll().stream().map(orderMapper::toOrderResponse).toList();
    }
    
    public OrderDetailsResponse createOrderDetails(OrderDetailsRequest orderDetailsRequest) {
        
        if (orderDetailsRepository.existsByOrderOrderIdAndShoeDetailsDetailsId(orderDetailsRequest.getOrderId(), orderDetailsRequest.getShoeDetailsId())) {
            throw new AppException(ErrorCode.EXISTED);
        } else {
            return orderDetailsMapper.toOrderDetailsResponse(orderDetailsRepository.save(orderDetailsMapper.toOrderDetails(orderDetailsRequest)));
        }
    }
    
    public OrderDetailsResponse updateOrderDetails(UUID orderDetailsId, OrderDetailsRequest orderDetailsRequest) {
        
        if (orderDetailsRepository.existsByOrderDetailsId(orderDetailsId)) {
            return orderDetailsMapper.toOrderDetailsResponse(orderDetailsRepository.save(orderDetailsMapper.toOrderDetails(orderDetailsRepository.findByOrderDetailsId(orderDetailsId), orderDetailsRequest)));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public OrderDetailsResponse getOrderDetails(UUID orderDetailsId) {
        
        if (orderDetailsRepository.existsByOrderDetailsId(orderDetailsId)) {
            return orderDetailsMapper.toOrderDetailsResponse(orderDetailsRepository.findByOrderDetailsId(orderDetailsId));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public List<OrderDetailsResponse> getAllOrderDetails() {
        
        return orderDetailsRepository.findAll().stream().map(orderDetailsMapper::toOrderDetailsResponse).toList();
    }
    
}
