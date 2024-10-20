package com.wonically.shoezy.backend.model.mapper.shoe.attributes;

import com.wonically.shoezy.backend.entity.shoe.attributes.ShoeColor;
import com.wonically.shoezy.backend.model.request.shoe.attributes.ShoeColorRequest;
import com.wonically.shoezy.backend.model.response.shoe.attributes.ShoeColorResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ShoeColorMapper {
    
    ShoeColor toShoeColor(ShoeColorRequest shoeColorRequest);
    
    ShoeColor toShoeColor(@MappingTarget ShoeColor shoeColor, ShoeColorRequest shoeColorRequest);
    
    ShoeColorResponse toShoeColorResponse(ShoeColor shoeColor);

}
