package com.wonically.shoezy.backend.model.response.shoe.attributes;

import com.wonically.shoezy.backend.utils.Status;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShoeZipperResponse {

    String zipperName;
    
    Status zipperStatus;

}
