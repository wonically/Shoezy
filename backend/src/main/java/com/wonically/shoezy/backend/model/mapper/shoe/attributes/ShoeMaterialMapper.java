package com.wonically.shoezy.backend.model.mapper.shoe.attributes;

import com.wonically.shoezy.backend.entity.shoe.attributes.ShoeMaterial;
import com.wonically.shoezy.backend.model.request.shoe.attributes.ShoeMaterialRequest;
import com.wonically.shoezy.backend.model.response.shoe.attributes.ShoeMaterialResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ShoeMaterialMapper {
    
    ShoeMaterial toShoeMaterial(ShoeMaterialRequest shoeMaterialRequest);
    
    ShoeMaterial toShoeMaterial(@MappingTarget ShoeMaterial shoeMaterial, ShoeMaterialRequest shoeMaterialRequest);
    
    ShoeMaterialResponse toShoeMaterialResponse(ShoeMaterial shoeMaterial);
    
}
