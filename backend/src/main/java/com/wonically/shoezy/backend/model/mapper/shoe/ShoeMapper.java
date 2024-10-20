package com.wonically.shoezy.backend.model.mapper.shoe;

import com.wonically.shoezy.backend.entity.shoe.Shoe;
import com.wonically.shoezy.backend.entity.shoe.attributes.ShoeDetails;
import com.wonically.shoezy.backend.entity.shoe.attributes.ShoeImage;
import com.wonically.shoezy.backend.model.mapper.shoe.attributes.*;
import com.wonically.shoezy.backend.model.request.shoe.ShoeRequest;
import com.wonically.shoezy.backend.model.response.shoe.ShoeResponse;
import com.wonically.shoezy.backend.model.response.shoe.attributes.ShoeDetailsResponse;
import com.wonically.shoezy.backend.model.response.shoe.attributes.ShoeImageResponse;
import com.wonically.shoezy.backend.repository.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

@Mapper(componentModel = "spring")
public abstract class ShoeMapper {
    
    @Autowired
    CountryRepository countryRepository;
    
    @Autowired
    CountryMapper countryMapper;
    
    @Autowired
    FactoryRepository factoryRepository;
    
    @Autowired
    FactoryMapper factoryMapper;
    
    @Autowired
    ShoeHeelRepository shoeHeelRepository;
    
    @Autowired
    ShoeHeelMapper shoeHeelMapper;
    
    @Autowired
    ShoeInsoleRepository shoeInsoleRepository;
    
    @Autowired
    ShoeInsoleMapper shoeInsoleMapper;
    
    @Autowired
    ShoeMaterialRepository shoeMaterialRepository;
    
    @Autowired
    ShoeMaterialMapper shoeMaterialMapper;
    
    @Autowired
    ShoeTipRepository shoeTipRepository;
    
    @Autowired
    ShoeTipMapper shoeTipMapper;
    
    @Autowired
    ShoeZipperRepository shoeZipperRepository;
    
    @Autowired
    ShoeZipperMapper shoeZipperMapper;
    
    @Autowired
    ShoeDetailsMapper shoeDetailsMapper;
    
    @Autowired
    ShoeImageMapper shoeImageMapper;
    
    @Mapping(target = "country", expression = "java(countryRepository.findByCountryCode(shoeRequest.getCountryCode()))")
    @Mapping(target = "factory", expression = "java(factoryRepository.findByFactoryName(shoeRequest.getFactoryName()))")
    @Mapping(target = "shoeHeel", expression = "java(shoeHeelRepository.findByHeelName(shoeRequest.getHeelName()))")
    @Mapping(target = "shoeInsole", expression = "java(shoeInsoleRepository.findByInsoleName(shoeRequest.getInsoleName()))")
    @Mapping(target = "shoeMaterial", expression = "java(shoeMaterialRepository.findByMaterialName(shoeRequest.getMaterialName()))")
    @Mapping(target = "shoeTip", expression = "java(shoeTipRepository.findByTipName(shoeRequest.getTipName()))")
    @Mapping(target = "shoeZipper", expression = "java(shoeZipperRepository.findByZipperName(shoeRequest.getZipperName()))")
    public abstract Shoe toShoe(ShoeRequest shoeRequest);
    
    @Mapping(target = "country", expression = "java(countryRepository.findByCountryCode(shoeRequest.getCountryCode()))")
    @Mapping(target = "factory", expression = "java(factoryRepository.findByFactoryName(shoeRequest.getFactoryName()))")
    @Mapping(target = "shoeHeel", expression = "java(shoeHeelRepository.findByHeelName(shoeRequest.getHeelName()))")
    @Mapping(target = "shoeInsole", expression = "java(shoeInsoleRepository.findByInsoleName(shoeRequest.getInsoleName()))")
    @Mapping(target = "shoeMaterial", expression = "java(shoeMaterialRepository.findByMaterialName(shoeRequest.getMaterialName()))")
    @Mapping(target = "shoeTip", expression = "java(shoeTipRepository.findByTipName(shoeRequest.getTipName()))")
    @Mapping(target = "shoeZipper", expression = "java(shoeZipperRepository.findByZipperName(shoeRequest.getZipperName()))")
    public abstract Shoe toShoe(@MappingTarget Shoe shoe, ShoeRequest shoeRequest);
    
    @Mapping(target = "country", expression = "java(countryMapper.toCountryResponse(shoe.getCountry()))")
    @Mapping(target = "factory", expression = "java(factoryMapper.toFactoryResponse(shoe.getFactory()))")
    @Mapping(target = "shoeHeel", expression = "java(shoeHeelMapper.toShoeHeelResponse(shoe.getShoeHeel()))")
    @Mapping(target = "shoeInsole", expression = "java(shoeInsoleMapper.toShoeInsoleResponse(shoe.getShoeInsole()))")
    @Mapping(target = "shoeMaterial", expression = "java(shoeMaterialMapper.toShoeMaterialResponse(shoe.getShoeMaterial()))")
    @Mapping(target = "shoeTip", expression = "java(shoeTipMapper.toShoeTipResponse(shoe.getShoeTip()))")
    @Mapping(target = "shoeZipper", expression = "java(shoeZipperMapper.toShoeZipperResponse(shoe.getShoeZipper()))")
    @Mapping(target = "shoeDetails", expression = "java(toShoeDetailsResponses(shoe.getShoeDetails()))")
    @Mapping(target = "shoeImage", expression = "java(toShoeImageResponses(shoe.getShoeImage()))")
    public abstract ShoeResponse toShoeResponse(Shoe shoe);
   
    public Set<ShoeDetailsResponse> toShoeDetailsResponses(Set<ShoeDetails> shoeDetailsSet) {
        
        Set<ShoeDetailsResponse> shoeDetailsResponses = new HashSet<>();
        for (ShoeDetails shoeDetails : shoeDetailsSet) {
            shoeDetailsResponses.add(shoeDetailsMapper.toShoeDetailsResponse(shoeDetails));
        }
        return shoeDetailsResponses;
    }
    
    ;
    
    public Set<ShoeImageResponse> toShoeImageResponses(Set<ShoeImage> shoeImageSet) {
        
        Set<ShoeImageResponse> shoeImageResponses = new HashSet<>();
        for (ShoeImage shoeImage : shoeImageSet) {
            shoeImageResponses.add(shoeImageMapper.toShoeImageResponse(shoeImage));
        }
        return shoeImageResponses;
    }
    
}
