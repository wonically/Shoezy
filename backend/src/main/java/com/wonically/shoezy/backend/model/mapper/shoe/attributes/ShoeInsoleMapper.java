package com.wonically.shoezy.backend.model.mapper.shoe.attributes;

import com.wonically.shoezy.backend.entity.shoe.attributes.ShoeInsole;
import com.wonically.shoezy.backend.model.request.shoe.attributes.ShoeInsoleRequest;
import com.wonically.shoezy.backend.model.response.shoe.attributes.ShoeInsoleResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ShoeInsoleMapper {
    
    ShoeInsole toShoeInsole(ShoeInsoleRequest shoeInsoleRequest);
    
    ShoeInsole toShoeInsole(@MappingTarget ShoeInsole shoeInsole, ShoeInsoleRequest shoeInsoleRequest);
    
    ShoeInsoleResponse toShoeInsoleResponse(ShoeInsole shoeInsole);
    
}
