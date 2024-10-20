package com.wonically.shoezy.backend.model.mapper.shoe.attributes;

import com.wonically.shoezy.backend.entity.shoe.attributes.Country;
import com.wonically.shoezy.backend.exception.AppException;
import com.wonically.shoezy.backend.exception.ErrorCode;
import com.wonically.shoezy.backend.model.request.shoe.attributes.CountryRequest;
import com.wonically.shoezy.backend.model.response.shoe.attributes.CountryResponse;
import org.mapstruct.*;

import java.util.Locale;

@Mapper(componentModel = "spring")
public interface CountryMapper {
    
    @Mapping(target = "countryName", expression = "java(getDisplayCountry(countryRequest))")
    Country toCountry(CountryRequest countryRequest);
    
    @Mapping(target = "countryName", expression = "java(getDisplayCountry(countryRequest))")
    Country toCountry(@MappingTarget Country country, CountryRequest countryRequest);
    
    CountryResponse toCountryResponse(Country country);

    default String getDisplayCountry(CountryRequest countryRequest) {
        String countryName = new Locale("", countryRequest.getCountryCode()).getDisplayCountry();
        if (countryName.equals(countryRequest.getCountryCode())) {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
        return new Locale("", countryRequest.getCountryCode()).getDisplayCountry();
    };
    
}
