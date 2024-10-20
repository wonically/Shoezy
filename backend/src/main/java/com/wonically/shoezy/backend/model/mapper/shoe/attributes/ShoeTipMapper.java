package com.wonically.shoezy.backend.model.mapper.shoe.attributes;

import com.wonically.shoezy.backend.entity.shoe.attributes.ShoeTip;
import com.wonically.shoezy.backend.model.request.shoe.attributes.ShoeTipRequest;
import com.wonically.shoezy.backend.model.response.shoe.attributes.ShoeTipResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ShoeTipMapper {
    
    ShoeTip toShoeTip(ShoeTipRequest shoeTipRequest);
    
    ShoeTip toShoeTip(@MappingTarget ShoeTip shoeTip, ShoeTipRequest shoeTipRequest);
    
    ShoeTipResponse toShoeTipResponse(ShoeTip shoeTip);
    
}
