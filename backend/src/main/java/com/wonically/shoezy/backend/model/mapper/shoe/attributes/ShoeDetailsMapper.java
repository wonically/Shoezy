package com.wonically.shoezy.backend.model.mapper.shoe.attributes;

import com.wonically.shoezy.backend.entity.shoe.attributes.ShoeDetails;
import com.wonically.shoezy.backend.model.request.shoe.attributes.ShoeDetailsRequest;
import com.wonically.shoezy.backend.model.response.shoe.attributes.ShoeDetailsResponse;
import com.wonically.shoezy.backend.repository.ShoeColorRepository;
import com.wonically.shoezy.backend.repository.ShoeRepository;
import com.wonically.shoezy.backend.repository.ShoeSizeRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class ShoeDetailsMapper {
    
    @Autowired
    ShoeRepository shoeRepository;
    
    @Autowired
    ShoeSizeRepository shoeSizeRepository;
    
    @Autowired
    ShoeColorRepository shoeColorRepository;
    
    @Autowired
    ShoeSizeMapper shoeSizeMapper;
    
    @Autowired
    ShoeColorMapper shoeColorMapper;
    
    @Mapping(target = "shoe", expression = "java(shoeRepository.findByShoeCode(shoeDetailsRequest.getShoeCode()))")
    @Mapping(target = "shoeSize", expression = "java(shoeSizeRepository.findBySizeNumberAndSizingSystem(shoeDetailsRequest.getSizeNumber(), shoeDetailsRequest.getSizingSystem()))")
    @Mapping(target = "shoeColor", expression = "java(shoeColorRepository.findByColorCode(shoeDetailsRequest.getColorCode()))")
    public abstract ShoeDetails toShoeDetails(ShoeDetailsRequest shoeDetailsRequest);
    
    @Mapping(target = "shoe", expression = "java(shoeRepository.findByShoeCode(shoeDetailsRequest.getShoeCode()))")
    @Mapping(target = "shoeSize", expression = "java(shoeSizeRepository.findBySizeNumberAndSizingSystem(shoeDetailsRequest.getSizeNumber(), shoeDetailsRequest.getSizingSystem()))")
    @Mapping(target = "shoeColor", expression = "java(shoeColorRepository.findByColorCode(shoeDetailsRequest.getColorCode()))")
    public abstract ShoeDetails toShoeDetails(@MappingTarget ShoeDetails shoeDetails, ShoeDetailsRequest shoeDetailsRequest);
    
    @Mapping(target = "shoeCode", expression = "java(shoeDetails.getShoe().getShoeCode())")
    @Mapping(target = "shoeSize", expression = "java(shoeSizeMapper.toShoeSizeResponse(shoeDetails.getShoeSize()))")
    @Mapping(target = "shoeColor", expression = "java(shoeColorMapper.toShoeColorResponse(shoeDetails.getShoeColor()))")
    public abstract ShoeDetailsResponse toShoeDetailsResponse(ShoeDetails shoeDetails);
    
}
