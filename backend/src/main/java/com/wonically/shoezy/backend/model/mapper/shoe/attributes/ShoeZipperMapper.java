package com.wonically.shoezy.backend.model.mapper.shoe.attributes;

import com.wonically.shoezy.backend.entity.shoe.attributes.ShoeZipper;
import com.wonically.shoezy.backend.model.request.shoe.attributes.ShoeZipperRequest;
import com.wonically.shoezy.backend.model.response.shoe.attributes.ShoeZipperResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ShoeZipperMapper {
    
    ShoeZipper toShoeZipper(ShoeZipperRequest shoeZipperRequest);
    
    ShoeZipper toShoeZipper(@MappingTarget ShoeZipper shoeZipper, ShoeZipperRequest shoeZipperRequest);
    
    ShoeZipperResponse toShoeZipperResponse(ShoeZipper shoeZipper);
    
}
