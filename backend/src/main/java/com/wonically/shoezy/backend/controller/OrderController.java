package com.wonically.shoezy.backend.controller;

import com.wonically.shoezy.backend.model.request.order.OrderDetailsRequest;
import com.wonically.shoezy.backend.model.request.order.OrderRequest;
import com.wonically.shoezy.backend.model.response.ApiResponse;
import com.wonically.shoezy.backend.service.OrderService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class OrderController {
    
    @Autowired
    OrderService orderService;
    
    @PostMapping("/create")
    public ApiResponse createOrder(@RequestBody @Valid OrderRequest orderRequest) {
        
        return ApiResponse.builder()
                .result(orderService.createOrder(orderRequest))
                .build();
    }
    
    @PutMapping("/update/{orderId}")
    public ApiResponse updateOrder(@PathVariable UUID orderId, @RequestBody @Valid OrderRequest orderRequest) {
        
        return ApiResponse.builder()
                .result(orderService.updateOrder(orderId, orderRequest))
                .build();
    }
    
    @GetMapping("/{orderId}")
    public ApiResponse getOrder(@PathVariable UUID orderId) {
        
        return ApiResponse.builder()
                .result(orderService.getOrder(orderId))
                .build();
    }
    
    @GetMapping("/all")
    public ApiResponse getOrders() {
        
        return ApiResponse.builder()
                .result(orderService.getOrders())
                .build();
    }
    
    @PostMapping("/details/create")
    public ApiResponse createOrderDetails(@RequestBody @Valid OrderDetailsRequest orderDetailsRequest) {
        
        return ApiResponse.builder()
                .result(orderService.createOrderDetails(orderDetailsRequest))
                .build();
    }
    
    @PutMapping("/details/update/{orderDetailsId}")
    public ApiResponse updateOrderDetails(@PathVariable UUID orderDetailsId, @RequestBody @Valid OrderDetailsRequest orderDetailsRequest) {
        
        return ApiResponse.builder()
                .result(orderService.updateOrderDetails(orderDetailsId, orderDetailsRequest))
                .build();
    }
    
    @GetMapping("/details/{orderDetailsId}")
    public ApiResponse getOrderDetails(@PathVariable UUID orderDetailsId) {
        
        return ApiResponse.builder()
                .result(orderService.getOrderDetails(orderDetailsId))
                .build();
    }
    
    @GetMapping("/details/all")
    public ApiResponse getAllOrderDetails() {
        
        return ApiResponse.builder()
                .result(orderService.getAllOrderDetails())
                .build();
    }
    
}
