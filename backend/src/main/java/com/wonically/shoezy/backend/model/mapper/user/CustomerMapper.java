package com.wonically.shoezy.backend.model.mapper.user;

import com.wonically.shoezy.backend.entity.user.Customer;
import com.wonically.shoezy.backend.model.request.user.CustomerRequest;
import com.wonically.shoezy.backend.model.response.user.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface CustomerMapper extends UserMapper {
    
    Customer toCustomer(CustomerRequest customerRequest);
    
    Customer toCustomer(@MappingTarget Customer customer, CustomerRequest customerRequest);
    
    CustomerResponse toCustomerResponse(Customer customer);

}
