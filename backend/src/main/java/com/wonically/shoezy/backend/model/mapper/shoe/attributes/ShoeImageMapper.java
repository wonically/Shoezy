package com.wonically.shoezy.backend.model.mapper.shoe.attributes;

import com.wonically.shoezy.backend.entity.shoe.attributes.ShoeImage;
import com.wonically.shoezy.backend.model.request.shoe.attributes.ShoeImageRequest;
import com.wonically.shoezy.backend.model.response.shoe.attributes.ShoeImageResponse;
import com.wonically.shoezy.backend.repository.ShoeRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class ShoeImageMapper {
    
    @Autowired
    ShoeRepository shoeRepository;
    
    @Mapping(target = "shoe", expression = "java(shoeRepository.findByShoeCode(shoeImageRequest.getShoeCode()))")
    public abstract ShoeImage toShoeImage(ShoeImageRequest shoeImageRequest);
    
    @Mapping(target = "shoe", expression = "java(shoeRepository.findByShoeCode(shoeImageRequest.getShoeCode()))")
    public abstract ShoeImage toShoeImage(@MappingTarget ShoeImage shoeImage, ShoeImageRequest shoeImageRequest);
    
    public abstract ShoeImageResponse toShoeImageResponse(ShoeImage shoeImage);
    
}
