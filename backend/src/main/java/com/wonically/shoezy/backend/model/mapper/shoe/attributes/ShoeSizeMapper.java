package com.wonically.shoezy.backend.model.mapper.shoe.attributes;

import com.wonically.shoezy.backend.entity.shoe.attributes.ShoeSize;
import com.wonically.shoezy.backend.model.request.shoe.attributes.ShoeSizeRequest;
import com.wonically.shoezy.backend.model.response.shoe.attributes.ShoeSizeResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ShoeSizeMapper {
    
    ShoeSize toShoeSize(ShoeSizeRequest shoeSizeRequest);
    
    ShoeSize toShoeSize(@MappingTarget ShoeSize shoeSize, ShoeSizeRequest shoeSizeRequest);
    
    ShoeSizeResponse toShoeSizeResponse(ShoeSize shoeSize);

}
