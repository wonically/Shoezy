package com.wonically.shoezy.backend.model.mapper.shoe.attributes;

import com.wonically.shoezy.backend.entity.shoe.attributes.ShoeHeel;
import com.wonically.shoezy.backend.model.request.shoe.attributes.ShoeHeelRequest;
import com.wonically.shoezy.backend.model.response.shoe.attributes.ShoeHeelResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ShoeHeelMapper {
    
    ShoeHeel toShoeHeel(ShoeHeelRequest shoeHeelRequest);
    
    ShoeHeel toShoeHeel(@MappingTarget ShoeHeel shoeHeel, ShoeHeelRequest shoeHeelRequest);
    
    ShoeHeelResponse toShoeHeelResponse(ShoeHeel shoeHeel);
    
}
