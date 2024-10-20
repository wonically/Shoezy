package com.wonically.shoezy.backend.model.mapper.shoe.attributes;

import com.wonically.shoezy.backend.entity.shoe.attributes.Factory;
import com.wonically.shoezy.backend.model.request.shoe.attributes.FactoryRequest;
import com.wonically.shoezy.backend.model.response.shoe.attributes.FactoryResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface FactoryMapper {
    
    Factory toFactory(FactoryRequest factoryRequest);
    
    Factory toFactory(@MappingTarget Factory factory, FactoryRequest factoryRequest);
    
    FactoryResponse toFactoryResponse(Factory factory);
    
}
