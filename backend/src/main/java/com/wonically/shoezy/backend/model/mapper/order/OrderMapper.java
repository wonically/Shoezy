package com.wonically.shoezy.backend.model.mapper.order;

import com.wonically.shoezy.backend.entity.order.Order;
import com.wonically.shoezy.backend.entity.order.OrderDetails;
import com.wonically.shoezy.backend.model.mapper.user.CustomerMapper;
import com.wonically.shoezy.backend.model.mapper.user.StaffMapper;
import com.wonically.shoezy.backend.model.request.order.OrderRequest;
import com.wonically.shoezy.backend.model.response.order.OrderDetailsResponse;
import com.wonically.shoezy.backend.model.response.order.OrderResponse;
import com.wonically.shoezy.backend.repository.CustomerRepository;
import com.wonically.shoezy.backend.repository.StaffRepository;
import org.mapstruct.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

@Mapper(componentModel = "spring")
public abstract class OrderMapper {
    
    @Autowired
    CustomerRepository customerRepository;
    
    @Autowired
    StaffRepository staffRepository;
    
    @Autowired
    CustomerMapper customerMapper;
    
    @Autowired
    StaffMapper staffMapper;
    
    @Autowired
    OrderDetailsMapper orderDetailsMapper;
    
    @Mapping(target = "customer", expression = "java(customerRepository.findByCode(orderRequest.getCustomerCode()))")
    @Mapping(target = "staff", expression = "java(staffRepository.findByCode(orderRequest.getStaffCode()))")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    public abstract Order toOrder(OrderRequest orderRequest);
    
    @Mapping(target = "customer", expression = "java(customerRepository.findByCode(orderRequest.getCustomerCode()))")
    @Mapping(target = "staff", expression = "java(staffRepository.findByCode(orderRequest.getStaffCode()))")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    public abstract Order toOrder(@MappingTarget Order order, OrderRequest orderRequest);
    
    @Mapping(target = "customer", expression = "java(customerMapper.toCustomerResponse(order.getCustomer()))")
    @Mapping(target = "staff", expression = "java(staffMapper.toStaffResponse(order.getStaff()))")
    @Mapping(target = "orderDetails", expression = "java(toOrderDetailsResponses(order.getOrderDetails()))")
    public abstract OrderResponse toOrderResponse(Order order);
    
    public Set<OrderDetailsResponse> toOrderDetailsResponses(Set<OrderDetails> orderDetailsSet) {
        
        Set<OrderDetailsResponse> orderDetailsResponses = new HashSet<>();
        for (OrderDetails orderDetails : orderDetailsSet) {
            orderDetailsResponses.add(orderDetailsMapper.toOrderDetailsResponse(orderDetails));
        }
        return orderDetailsResponses;
    }
    
}
