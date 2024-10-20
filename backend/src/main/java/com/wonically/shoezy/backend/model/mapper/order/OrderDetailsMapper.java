package com.wonically.shoezy.backend.model.mapper.order;

import com.wonically.shoezy.backend.entity.order.OrderDetails;
import com.wonically.shoezy.backend.model.mapper.shoe.attributes.ShoeDetailsMapper;
import com.wonically.shoezy.backend.model.request.order.OrderDetailsRequest;
import com.wonically.shoezy.backend.model.response.order.OrderDetailsResponse;
import com.wonically.shoezy.backend.repository.OrderRepository;
import com.wonically.shoezy.backend.repository.ShoeDetailsRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class OrderDetailsMapper {
    
    @Autowired
    OrderRepository orderRepository;
    
    @Autowired
    ShoeDetailsRepository shoeDetailsRepository;
    
    @Autowired
    ShoeDetailsMapper shoeDetailsMapper;
    
    @Mapping(target = "order", expression = "java(orderRepository.findByOrderId(orderDetailsRequest.getOrderId()))")
    @Mapping(target = "shoeDetails", expression = "java(shoeDetailsRepository.findByDetailsId(orderDetailsRequest.getShoeDetailsId()))")
    public abstract OrderDetails toOrderDetails(OrderDetailsRequest orderDetailsRequest);
    
    @Mapping(target = "order", expression = "java(orderRepository.findByOrderId(orderDetailsRequest.getOrderId()))")
    @Mapping(target = "shoeDetails", expression = "java(shoeDetailsRepository.findByDetailsId(orderDetailsRequest.getShoeDetailsId()))")
    public abstract OrderDetails toOrderDetails(@MappingTarget OrderDetails orderDetails, OrderDetailsRequest orderDetailsRequest);
    
    @Mapping(target = "shoeDetails", expression = "java(shoeDetailsMapper.toShoeDetailsResponse(orderDetails.getShoeDetails()))")
    public abstract OrderDetailsResponse toOrderDetailsResponse(OrderDetails orderDetails);
    
}
