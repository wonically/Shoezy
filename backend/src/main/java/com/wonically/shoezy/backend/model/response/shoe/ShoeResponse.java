package com.wonically.shoezy.backend.model.response.shoe;

import com.wonically.shoezy.backend.model.response.shoe.attributes.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Set;
import java.util.UUID;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShoeResponse {

    UUID shoeId;

    String shoeCode;

    String shoeName;

    String shoeDescription;

    CountryResponse country;

    FactoryResponse factory;

    ShoeHeelResponse shoeHeel;

    ShoeInsoleResponse shoeInsole;

    ShoeMaterialResponse shoeMaterial;

    ShoeTipResponse shoeTip;

    ShoeZipperResponse shoeZipper;
    
    Set<ShoeDetailsResponse> shoeDetails;
    
    Set<ShoeImageResponse> shoeImage;
    
}
