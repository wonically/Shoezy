package com.wonically.shoezy.backend.service;

import com.wonically.shoezy.backend.exception.AppException;
import com.wonically.shoezy.backend.exception.ErrorCode;
import com.wonically.shoezy.backend.model.request.shoe.attributes.*;
import com.wonically.shoezy.backend.model.mapper.shoe.ShoeMapper;
import com.wonically.shoezy.backend.model.mapper.shoe.attributes.*;
import com.wonically.shoezy.backend.model.request.shoe.ShoeRequest;
import com.wonically.shoezy.backend.model.response.shoe.ShoeResponse;
import com.wonically.shoezy.backend.model.response.shoe.attributes.*;
import com.wonically.shoezy.backend.repository.*;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ShoeService {
    
    @Autowired
    CountryRepository countryRepository;
    
    @Autowired
    CountryMapper countryMapper;
    
    @Autowired
    FactoryRepository factoryRepository;
    
    @Autowired
    FactoryMapper factoryMapper;
    
    @Autowired
    ShoeColorRepository shoeColorRepository;
    
    @Autowired
    ShoeColorMapper shoeColorMapper;
    
    @Autowired
    ShoeDetailsRepository shoeDetailsRepository;
    
    @Autowired
    ShoeDetailsMapper shoeDetailsMapper;
    
    @Autowired
    ShoeHeelRepository shoeHeelRepository;
    
    @Autowired
    ShoeHeelMapper shoeHeelMapper;
    
    @Autowired
    ShoeImageRepository shoeImageRepository;
    
    @Autowired
    ShoeImageMapper shoeImageMapper;
    
    @Autowired
    ShoeInsoleRepository shoeInsoleRepository;
    
    @Autowired
    ShoeInsoleMapper shoeInsoleMapper;
    
    @Autowired
    ShoeMaterialRepository shoeMaterialRepository;
    
    @Autowired
    ShoeMaterialMapper shoeMaterialMapper;
    
    @Autowired
    ShoeRepository shoeRepository;
    
    @Autowired
    ShoeMapper shoeMapper;
    
    @Autowired
    ShoeSizeRepository shoeSizeRepository;
    
    @Autowired
    ShoeSizeMapper shoeSizeMapper;
    
    @Autowired
    ShoeTipRepository shoeTipRepository;
    
    @Autowired
    ShoeTipMapper shoeTipMapper;
    
    @Autowired
    ShoeZipperRepository shoeZipperRepository;
    
    @Autowired
    ShoeZipperMapper shoeZipperMapper;
    
    public CountryResponse createCountry(CountryRequest countryRequest) {
        
        if (countryRepository.existsByCountryCode(countryRequest.getCountryCode())) {
            throw new AppException(ErrorCode.EXISTED);
        } else {
            return countryMapper.toCountryResponse(countryRepository.save(countryMapper.toCountry(countryRequest)));
        }
    }
    
    public CountryResponse updateCountry(String countryCode, CountryRequest countryRequest) {
        
        if (countryRepository.existsByCountryCode(countryRequest.getCountryCode())) {
            return countryMapper.toCountryResponse(countryRepository.save(countryMapper.toCountry(countryRepository.findByCountryCode(countryCode), countryRequest)));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public CountryResponse getCountry(String country) {
        
        if (countryRepository.existsByCountryCodeOrCountryName(country, country)) {
            return countryMapper.toCountryResponse(countryRepository.findByCountryCodeOrCountryName(country, country));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public List<CountryResponse> getCountries() {
        
        return countryRepository.findAll().stream().map(countryMapper::toCountryResponse).toList();
    }
    
    public FactoryResponse createFactory(FactoryRequest factoryRequest) {
        
        if (factoryRepository.existsByFactoryName(factoryRequest.getFactoryName())) {
            throw new AppException(ErrorCode.EXISTED);
        } else {
            return factoryMapper.toFactoryResponse(factoryRepository.save(factoryMapper.toFactory(factoryRequest)));
        }
    }
    
    public FactoryResponse updateFactory(String factoryName, FactoryRequest factoryRequest) {
        
        if (factoryRepository.existsByFactoryName(factoryName)) {
            return factoryMapper.toFactoryResponse(factoryRepository.save(factoryMapper.toFactory(factoryRepository.findByFactoryName(factoryName), factoryRequest)));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public FactoryResponse getFactory(String factoryName) {
        
        if (factoryRepository.existsByFactoryName(factoryName)) {
            return factoryMapper.toFactoryResponse(factoryRepository.findByFactoryName(factoryName));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public List<FactoryResponse> getFactories() {
        
        return factoryRepository.findAll().stream().map(factoryMapper::toFactoryResponse).toList();
    }
    
    public ShoeColorResponse createShoeColor(ShoeColorRequest shoeColorRequest) {
        
        if (shoeColorRepository.existsByColorCode(shoeColorRequest.getColorCode())) {
            throw new AppException(ErrorCode.EXISTED);
        } else {
            return shoeColorMapper.toShoeColorResponse(shoeColorRepository.save(shoeColorMapper.toShoeColor(shoeColorRequest)));
        }
    }
    
    public ShoeColorResponse updateShoeColor(String colorCode, ShoeColorRequest shoeColorRequest) {
        
        if (shoeColorRepository.existsByColorCode(colorCode)) {
            return shoeColorMapper.toShoeColorResponse(shoeColorRepository.save(shoeColorMapper.toShoeColor(shoeColorRepository.findByColorCode(colorCode), shoeColorRequest)));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public ShoeColorResponse getShoeColor(String colorCode) {
        
        if (shoeColorRepository.existsByColorCode(colorCode)) {
            return shoeColorMapper.toShoeColorResponse(shoeColorRepository.findByColorCode(colorCode));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public List<ShoeColorResponse> getShoeColors() {
        
        return shoeColorRepository.findAll().stream().map(shoeColorMapper::toShoeColorResponse).toList();
    }
    
    public ShoeDetailsResponse createShoeDetails(ShoeDetailsRequest shoeDetailsRequest) {
        
        if (shoeDetailsRepository.existsByShoeShoeCodeAndShoeSizeSizeNumberAndShoeSizeSizingSystemAndShoeColorColorCode(shoeDetailsRequest.getShoeCode(), shoeDetailsRequest.getSizeNumber(), shoeDetailsRequest.getSizingSystem(), shoeDetailsRequest.getColorCode())) {
            throw new AppException(ErrorCode.EXISTED);
        } else {
            return shoeDetailsMapper.toShoeDetailsResponse(shoeDetailsRepository.save(shoeDetailsMapper.toShoeDetails(shoeDetailsRequest)));
        }
    }
    
    public ShoeDetailsResponse updateShoeDetails(UUID detailsId, ShoeDetailsRequest shoeDetailsRequest) {
        
        if (shoeDetailsRepository.existsByDetailsId(detailsId)) {
            return shoeDetailsMapper.toShoeDetailsResponse(shoeDetailsRepository.save(shoeDetailsMapper.toShoeDetails(shoeDetailsRepository.findByDetailsId(detailsId), shoeDetailsRequest)));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public ShoeDetailsResponse getShoeDetails(UUID detailsId) {
        
        if (shoeDetailsRepository.existsByDetailsId(detailsId)) {
            return shoeDetailsMapper.toShoeDetailsResponse(shoeDetailsRepository.findByDetailsId(detailsId));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public List<ShoeDetailsResponse> getAllShoeDetails() {
        
        return shoeDetailsRepository.findAll().stream().map(shoeDetailsMapper::toShoeDetailsResponse).toList();
    }
    
    public ShoeHeelResponse createShoeHeel(ShoeHeelRequest shoeHeelRequest) {
        
        if (shoeHeelRepository.existsByHeelName(shoeHeelRequest.getHeelName())) {
            throw new AppException(ErrorCode.EXISTED);
        } else {
            return shoeHeelMapper.toShoeHeelResponse(shoeHeelRepository.save(shoeHeelMapper.toShoeHeel(shoeHeelRequest)));
        }
    }
    
    public ShoeHeelResponse updateShoeHeel(String heelName, ShoeHeelRequest shoeHeelRequest) {
        
        if (shoeHeelRepository.existsByHeelName(heelName)) {
            return shoeHeelMapper.toShoeHeelResponse(shoeHeelRepository.save(shoeHeelMapper.toShoeHeel(shoeHeelRepository.findByHeelName(heelName), shoeHeelRequest)));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public ShoeHeelResponse getShoeHeel(String heelName) {
        
        if (shoeHeelRepository.existsByHeelName(heelName)) {
            return shoeHeelMapper.toShoeHeelResponse(shoeHeelRepository.findByHeelName(heelName));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public List<ShoeHeelResponse> getShoeHeels() {
        
        return shoeHeelRepository.findAll().stream().map(shoeHeelMapper::toShoeHeelResponse).toList();
    }
    
    public ShoeImageResponse createShoeImage(ShoeImageRequest shoeImageRequest) {
        
        if (shoeImageRepository.existsByImageUrl(shoeImageRequest.getImageUrl())) {
            throw new AppException(ErrorCode.EXISTED);
        } else {
            return shoeImageMapper.toShoeImageResponse(shoeImageRepository.save(shoeImageMapper.toShoeImage(shoeImageRequest)));
        }
    }
    
    public ShoeImageResponse updateShoeImage(UUID imageId, ShoeImageRequest shoeImageRequest) {
        
        if (shoeImageRepository.existsByImageId(imageId)) {
            return shoeImageMapper.toShoeImageResponse(shoeImageRepository.save(shoeImageMapper.toShoeImage(shoeImageRepository.findByImageId(imageId), shoeImageRequest)));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public ShoeImageResponse getShoeImage(UUID imageId) {
        
        if (shoeImageRepository.existsByImageId(imageId)) {
            return shoeImageMapper.toShoeImageResponse(shoeImageRepository.findByImageId(imageId));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public List<ShoeImageResponse> getShoeImages() {
        
        return shoeImageRepository.findAll().stream().map(shoeImageMapper::toShoeImageResponse).toList();
    }
    
    public ShoeInsoleResponse createShoeInsole(ShoeInsoleRequest shoeInsoleRequest) {
        
        if (shoeInsoleRepository.existsByInsoleName(shoeInsoleRequest.getInsoleName())) {
            throw new AppException(ErrorCode.EXISTED);
        } else {
            return shoeInsoleMapper.toShoeInsoleResponse(shoeInsoleRepository.save(shoeInsoleMapper.toShoeInsole(shoeInsoleRequest)));
        }
    }
    
    public ShoeInsoleResponse updateShoeInsole(String insoleName, ShoeInsoleRequest shoeInsoleRequest) {
        
        if (shoeInsoleRepository.existsByInsoleName(insoleName)) {
            return shoeInsoleMapper.toShoeInsoleResponse(shoeInsoleRepository.save(shoeInsoleMapper.toShoeInsole(shoeInsoleRepository.findByInsoleName(insoleName), shoeInsoleRequest)));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public ShoeInsoleResponse getShoeInsole(String insoleName) {
        
        if (shoeInsoleRepository.existsByInsoleName(insoleName)) {
            return shoeInsoleMapper.toShoeInsoleResponse(shoeInsoleRepository.findByInsoleName(insoleName));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public List<ShoeInsoleResponse> getShoeInsoles() {
        
        return shoeInsoleRepository.findAll().stream().map(shoeInsoleMapper::toShoeInsoleResponse).toList();
    }
    
    public ShoeMaterialResponse createShoeMaterial(ShoeMaterialRequest shoeMaterialRequest) {
        
        if (shoeMaterialRepository.existsByMaterialName(shoeMaterialRequest.getMaterialName())) {
            throw new AppException(ErrorCode.EXISTED);
        } else {
            return shoeMaterialMapper.toShoeMaterialResponse(shoeMaterialRepository.save(shoeMaterialMapper.toShoeMaterial(shoeMaterialRequest)));
        }
    }
    
    public ShoeMaterialResponse updateShoeMaterial(String materialName, ShoeMaterialRequest shoeMaterialRequest) {
        
        if (shoeMaterialRepository.existsByMaterialName(materialName)) {
            return shoeMaterialMapper.toShoeMaterialResponse(shoeMaterialRepository.save(shoeMaterialMapper.toShoeMaterial(shoeMaterialRepository.findByMaterialName(materialName), shoeMaterialRequest)));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public ShoeMaterialResponse getShoeMaterial(String materialName) {
        
        if (shoeMaterialRepository.existsByMaterialName(materialName)) {
            return shoeMaterialMapper.toShoeMaterialResponse(shoeMaterialRepository.findByMaterialName(materialName));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public List<ShoeMaterialResponse> getShoeMaterials() {
        
        return shoeMaterialRepository.findAll().stream().map(shoeMaterialMapper::toShoeMaterialResponse).toList();
    }
    
    public ShoeResponse createShoe(ShoeRequest shoeRequest) {
        
        if (shoeRepository.existsByShoeCode(shoeRequest.getShoeCode())) {
            throw new AppException(ErrorCode.EXISTED);
        } else {
            return shoeMapper.toShoeResponse(shoeRepository.save(shoeMapper.toShoe(shoeRequest)));
        }
    }
    
    public ShoeResponse updateShoe(String shoeCode, ShoeRequest shoeRequest) {
        
        if (shoeRepository.existsByShoeCode(shoeCode)) {
            return shoeMapper.toShoeResponse(shoeRepository.save(shoeMapper.toShoe(shoeRepository.findByShoeCode(shoeCode), shoeRequest)));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public ShoeResponse getShoe(String shoeCode) {
        
        if (shoeRepository.existsByShoeCode(shoeCode)) {
            return shoeMapper.toShoeResponse(shoeRepository.findByShoeCode(shoeCode));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public List<ShoeResponse> getShoes() {
        
        return shoeRepository.findAll().stream().map(shoeMapper::toShoeResponse).toList();
    }
    
    public ShoeSizeResponse createShoeSize(ShoeSizeRequest shoeSizeRequest) {
        
        if (shoeSizeRepository.existsBySizeNumberAndSizingSystem(shoeSizeRequest.getSizeNumber(), shoeSizeRequest.getSizingSystem())) {
            throw new AppException(ErrorCode.EXISTED);
        } else {
            return shoeSizeMapper.toShoeSizeResponse(shoeSizeRepository.save(shoeSizeMapper.toShoeSize(shoeSizeRequest)));
        }
    }
    
    public ShoeSizeResponse updateShoeSize(float sizeNumber, String sizingSystem, ShoeSizeRequest shoeSizeRequest) {
        
        if (shoeSizeRepository.existsBySizeNumberAndSizingSystem(sizeNumber, sizingSystem)) {
            return shoeSizeMapper.toShoeSizeResponse(shoeSizeRepository.save(shoeSizeMapper.toShoeSize(shoeSizeRepository.findBySizeNumberAndSizingSystem(sizeNumber, sizingSystem), shoeSizeRequest)));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public ShoeSizeResponse getShoeSize(float sizeNumber, String sizingSystem) {
        
        if (shoeSizeRepository.existsBySizeNumberAndSizingSystem(sizeNumber, sizingSystem)) {
            return shoeSizeMapper.toShoeSizeResponse(shoeSizeRepository.findBySizeNumberAndSizingSystem(sizeNumber, sizingSystem));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public List<ShoeSizeResponse> getShoeSizes() {
        
        return shoeSizeRepository.findAll().stream().map(shoeSizeMapper::toShoeSizeResponse).toList();
    }
    
    public ShoeTipResponse createShoeTip(ShoeTipRequest shoeTipRequest) {
        
        if (shoeTipRepository.existsByTipName(shoeTipRequest.getTipName())) {
            throw new AppException(ErrorCode.EXISTED);
        } else {
            return shoeTipMapper.toShoeTipResponse(shoeTipRepository.save(shoeTipMapper.toShoeTip(shoeTipRequest)));
        }
    }
    
    public ShoeTipResponse updateShoeTip(String tipName, ShoeTipRequest shoeTipRequest) {
        
        if (shoeTipRepository.existsByTipName(tipName)) {
            return shoeTipMapper.toShoeTipResponse(shoeTipRepository.save(shoeTipMapper.toShoeTip(shoeTipRepository.findByTipName(tipName), shoeTipRequest)));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public ShoeTipResponse getShoeTip(String tipName) {
        
        if (shoeTipRepository.existsByTipName(tipName)) {
            return shoeTipMapper.toShoeTipResponse(shoeTipRepository.findByTipName(tipName));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public List<ShoeTipResponse> getShoeTips() {
        
        return shoeTipRepository.findAll().stream().map(shoeTipMapper::toShoeTipResponse).toList();
    }
    
    public ShoeZipperResponse createShoeZipper(ShoeZipperRequest shoeZipperRequest) {
        
        if (shoeZipperRepository.existsByZipperName(shoeZipperRequest.getZipperName())) {
            throw new AppException(ErrorCode.EXISTED);
        } else {
            return shoeZipperMapper.toShoeZipperResponse(shoeZipperRepository.save(shoeZipperMapper.toShoeZipper(shoeZipperRequest)));
        }
    }
    
    public ShoeZipperResponse updateShoeZipper(String zipperName, ShoeZipperRequest shoeZipperRequest) {
        
        if (shoeZipperRepository.existsByZipperName(zipperName)) {
            return shoeZipperMapper.toShoeZipperResponse(shoeZipperRepository.save(shoeZipperMapper.toShoeZipper(shoeZipperRepository.findByZipperName(zipperName), shoeZipperRequest)));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public ShoeZipperResponse getShoeZipper(String zipperName) {
        
        if (shoeZipperRepository.existsByZipperName(zipperName)) {
            return shoeZipperMapper.toShoeZipperResponse(shoeZipperRepository.findByZipperName(zipperName));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public List<ShoeZipperResponse> getShoeZippers() {
        
        return shoeZipperRepository.findAll().stream().map(shoeZipperMapper::toShoeZipperResponse).toList();
    }
    
}
