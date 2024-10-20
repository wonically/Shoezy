package com.wonically.shoezy.backend.model.mapper.user;

import com.wonically.shoezy.backend.entity.user.Address;
import com.wonically.shoezy.backend.model.request.user.AddressRequest;
import com.wonically.shoezy.backend.model.response.user.AddressResponse;
import com.wonically.shoezy.backend.repository.CustomerRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class AddressMapper {
    
    @Autowired
    CustomerRepository customerRepository;
    
    @Mapping(target = "customer", expression = "java(customerRepository.findByCode(addressRequest.getCustomerCode()))")
    public abstract Address toAddress(AddressRequest addressRequest);
    
    @Mapping(target = "customer", expression = "java(customerRepository.findByCode(addressRequest.getCustomerCode()))")
    public abstract Address toAddress(@MappingTarget Address address, AddressRequest addressRequest);

    public abstract AddressResponse toAddressResponse(Address address);
}
