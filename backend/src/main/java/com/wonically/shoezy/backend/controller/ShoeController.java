package com.wonically.shoezy.backend.controller;

import com.wonically.shoezy.backend.model.request.shoe.ShoeRequest;
import com.wonically.shoezy.backend.model.request.shoe.attributes.*;
import com.wonically.shoezy.backend.model.response.ApiResponse;
import com.wonically.shoezy.backend.service.ShoeService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/shoe")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ShoeController {
    
    @Autowired
    ShoeService shoeService;
    
    @PostMapping("/country/create")
    public ApiResponse createCountry(@RequestBody @Valid CountryRequest countryRequest) {
        
        return ApiResponse.builder()
                .result(shoeService.createCountry(countryRequest))
                .build();
    }
    
    @PutMapping("/country/update/{countryCode}")
    public ApiResponse updateCountry(@PathVariable String countryCode, @RequestBody @Valid CountryRequest countryRequest) {
        
        return ApiResponse.builder()
                .result(shoeService.updateCountry(countryCode, countryRequest))
                .build();
    }
    
    @GetMapping("/country/{country}")
    public ApiResponse getCountry(@PathVariable String country) {
        
        return ApiResponse.builder()
                .result(shoeService.getCountry(country))
                .build();
    }
    
    @GetMapping("/countries")
    public ApiResponse getCountries() {
        
        return ApiResponse.builder()
                .result(shoeService.getCountries())
                .build();
    }
    
    @PostMapping("/factory/create")
    public ApiResponse createFactory(@RequestBody @Valid FactoryRequest factoryRequest) {
        
        return ApiResponse.builder()
                .result(shoeService.createFactory(factoryRequest))
                .build();
    }
    
    @PutMapping("/factory/update/{factoryName}")
    public ApiResponse updateFactory(@PathVariable String factoryName, @RequestBody @Valid FactoryRequest factoryRequest) {
        
        return ApiResponse.builder()
                .result(shoeService.updateFactory(factoryName, factoryRequest))
                .build();
    }
    
    @GetMapping("/factory/{factoryName}")
    public ApiResponse getFactory(@PathVariable String factoryName) {
        
        return ApiResponse.builder()
                .result(shoeService.getFactory(factoryName))
                .build();
    }
    
    @GetMapping("/factories")
    public ApiResponse getFactories() {
        
        return ApiResponse.builder()
                .result(shoeService.getFactories())
                .build();
    }
    
    @PostMapping("/color/create")
    public ApiResponse createShoeColor(@RequestBody @Valid ShoeColorRequest shoeColorRequest) {
        
        return ApiResponse.builder()
                .result(shoeService.createShoeColor(shoeColorRequest))
                .build();
    }
    
    @PutMapping("/color/update/{colorCode}")
    public ApiResponse updateShoeColor(@PathVariable String colorCode, @RequestBody @Valid ShoeColorRequest shoeColorRequest) {
        
        return ApiResponse.builder()
                .result(shoeService.updateShoeColor(colorCode, shoeColorRequest))
                .build();
    }
    
    @GetMapping("/color/{colorCode}")
    public ApiResponse getShoeColor(@PathVariable String colorCode) {
        
        return ApiResponse.builder()
                .result(shoeService.getShoeColor(colorCode))
                .build();
    }
    
    @GetMapping("/colors")
    public ApiResponse getShoeColors() {
        
        return ApiResponse.builder()
                .result(shoeService.getShoeColors())
                .build();
    }
    
    @PostMapping("/details/create")
    public ApiResponse createShoeDetails(@RequestBody @Valid ShoeDetailsRequest shoeDetailsRequest) {
        
        return ApiResponse.builder()
                .result(shoeService.createShoeDetails(shoeDetailsRequest))
                .build();
    }
    
    @PutMapping("/details/update/{detailsId}")
    public ApiResponse updateShoeDetails(@PathVariable UUID detailsId, @RequestBody @Valid ShoeDetailsRequest shoeDetailsRequest) {
        
        return ApiResponse.builder()
                .result(shoeService.updateShoeDetails(detailsId, shoeDetailsRequest))
                .build();
    }
    
    @GetMapping("/details/{detailsId}")
    public ApiResponse getShoeDetails(@PathVariable UUID detailsId) {
        
        return ApiResponse.builder()
                .result(shoeService.getShoeDetails(detailsId))
                .build();
    }
    
    @GetMapping("/details")
    public ApiResponse getAllShoeDetails() {
        
        return ApiResponse.builder()
                .result(shoeService.getAllShoeDetails())
                .build();
    }
    
    @PostMapping("/heel/create")
    public ApiResponse createShoeHeel(@RequestBody @Valid ShoeHeelRequest shoeHeelRequest) {
        
        return ApiResponse.builder()
                .result(shoeService.createShoeHeel(shoeHeelRequest))
                .build();
    }
    
    @PutMapping("/heel/update/{heelName}")
    public ApiResponse updateShoeHeel(@PathVariable String heelName, @RequestBody @Valid ShoeHeelRequest shoeHeelRequest) {
        
        return ApiResponse.builder()
                .result(shoeService.updateShoeHeel(heelName, shoeHeelRequest))
                .build();
    }
    
    @GetMapping("/heel/{heelName}")
    public ApiResponse getShoeHeel(@PathVariable String heelName) {
        
        return ApiResponse.builder()
                .result(shoeService.getShoeHeel(heelName))
                .build();
    }
    
    @GetMapping("/heels")
    public ApiResponse getShoeHeels() {
        
        return ApiResponse.builder()
                .result(shoeService.getShoeHeels())
                .build();
    }
    
    @PostMapping("/image/create")
    public ApiResponse createShoeImage(@RequestBody @Valid ShoeImageRequest shoeImageRequest) {
        
        return ApiResponse.builder()
                .result(shoeService.createShoeImage(shoeImageRequest))
                .build();
    }
    
    @PutMapping("/image/update/{imageId}")
    public ApiResponse updateShoeImage(@PathVariable UUID imageId, @RequestBody @Valid ShoeImageRequest shoeImageRequest) {
        
        return ApiResponse.builder()
                .result(shoeService.updateShoeImage(imageId, shoeImageRequest))
                .build();
    }
    
    @GetMapping("/image/{imageId}")
    public ApiResponse getShoeImage(@PathVariable UUID imageId) {
        
        return ApiResponse.builder()
                .result(shoeService.getShoeImage(imageId))
                .build();
    }
    
    @GetMapping("/images")
    public ApiResponse getShoeImages() {
        
        return ApiResponse.builder()
                .result(shoeService.getShoeImages())
                .build();
    }
    
    @PostMapping("/insole/create")
    public ApiResponse createShoeInsole(@RequestBody @Valid ShoeInsoleRequest shoeInsoleRequest) {
        
        return ApiResponse.builder()
                .result(shoeService.createShoeInsole(shoeInsoleRequest))
                .build();
    }
    
    @PutMapping("/insole/update/{insoleName}")
    public ApiResponse updateShoeInsole(@PathVariable String insoleName, @RequestBody @Valid ShoeInsoleRequest shoeInsoleRequest) {
        
        return ApiResponse.builder()
                .result(shoeService.updateShoeInsole(insoleName, shoeInsoleRequest))
                .build();
    }
    
    @GetMapping("/insole/{insoleName}")
    public ApiResponse getShoeInsole(@PathVariable String insoleName) {
        
        return ApiResponse.builder()
                .result(shoeService.getShoeInsole(insoleName))
                .build();
    }
    
    @GetMapping("/insoles")
    public ApiResponse getShoeInsoles() {
        
        return ApiResponse.builder()
                .result(shoeService.getShoeInsoles())
                .build();
    }
    
    @PostMapping("/material/create")
    public ApiResponse createShoeMaterial(@RequestBody @Valid ShoeMaterialRequest shoeMaterialRequest) {
        
        return ApiResponse.builder()
                .result(shoeService.createShoeMaterial(shoeMaterialRequest))
                .build();
    }
    
    @PutMapping("/material/update/{materialName}")
    public ApiResponse updateShoeMaterial(@PathVariable String materialName, @RequestBody @Valid ShoeMaterialRequest shoeMaterialRequest) {
        
        return ApiResponse.builder()
                .result(shoeService.updateShoeMaterial(materialName, shoeMaterialRequest))
                .build();
    }
    
    @GetMapping("/material/{materialName}")
    public ApiResponse getShoeMaterial(@PathVariable String materialName) {
        
        return ApiResponse.builder()
                .result(shoeService.getShoeMaterial(materialName))
                .build();
    }
    
    @GetMapping("/materials")
    public ApiResponse getShoeMaterials() {
        
        return ApiResponse.builder()
                .result(shoeService.getShoeMaterials())
                .build();
    }
    
    @PostMapping("/create")
    public ApiResponse createShoe(@RequestBody @Valid ShoeRequest shoeRequest) {
        
        return ApiResponse.builder()
                .result(shoeService.createShoe(shoeRequest))
                .build();
    }
    
    @PutMapping("/update/{shoeCode}")
    public ApiResponse updateShoe(@PathVariable String shoeCode, @RequestBody @Valid ShoeRequest shoeRequest) {
        
        return ApiResponse.builder()
                .result(shoeService.updateShoe(shoeCode, shoeRequest))
                .build();
    }
    
    @GetMapping("/{shoeCode}")
    public ApiResponse getShoe(@PathVariable String shoeCode) {
        
        return ApiResponse.builder()
                .result(shoeService.getShoe(shoeCode))
                .build();
    }
    
    @GetMapping("/all")
    public ApiResponse getShoes() {
        
        return ApiResponse.builder()
                .result(shoeService.getShoes())
                .build();
    }
    
    @PostMapping("/size/create")
    public ApiResponse modifyShoeSize(@RequestBody @Valid ShoeSizeRequest shoeSizeRequest) {
        
        return ApiResponse.builder()
                .result(shoeService.createShoeSize(shoeSizeRequest))
                .build();
    }
    
    @PutMapping("/size/update/{sizingSystem}-{sizeNumber}")
    public ApiResponse updateShoeSize(@PathVariable float sizeNumber, @PathVariable String sizingSystem, @RequestBody @Valid ShoeSizeRequest shoeSizeRequest) {
        
        return ApiResponse.builder()
                .result(shoeService.updateShoeSize(sizeNumber, sizingSystem, shoeSizeRequest))
                .build();
    }
    
    @GetMapping("/size/{sizingSystem}-{sizeNumber}")
    public ApiResponse getShoeSize(@PathVariable float sizeNumber, @PathVariable String sizingSystem) {
        
        return ApiResponse.builder()
                .result(shoeService.getShoeSize(sizeNumber, sizingSystem))
                .build();
    }
    
    @GetMapping("/sizes")
    public ApiResponse getShoeSizes() {
        
        return ApiResponse.builder()
                .result(shoeService.getShoeSizes())
                .build();
    }
    
    @PostMapping("/tip/create")
    public ApiResponse createShoeTip(@RequestBody @Valid ShoeTipRequest shoeTipRequest) {
        
        return ApiResponse.builder()
                .result(shoeService.createShoeTip(shoeTipRequest))
                .build();
    }
    
    @PutMapping("/tip/update/{tipName}")
    public ApiResponse updateShoeTip(@PathVariable String tipName, @RequestBody @Valid ShoeTipRequest shoeTipRequest) {
        
        return ApiResponse.builder()
                .result(shoeService.updateShoeTip(tipName, shoeTipRequest))
                .build();
    }
    
    @GetMapping("/tip/{tipName}")
    public ApiResponse getShoeTip(@PathVariable String tipName) {
        
        return ApiResponse.builder()
                .result(shoeService.getShoeTip(tipName))
                .build();
    }
    
    @GetMapping("/tips")
    public ApiResponse getShoeTips() {
        
        return ApiResponse.builder()
                .result(shoeService.getShoeTips())
                .build();
    }
    
    @PostMapping("/zipper/create")
    public ApiResponse createShoeZipper(@RequestBody @Valid ShoeZipperRequest shoeZipperRequest) {
        
        return ApiResponse.builder()
                .result(shoeService.createShoeZipper(shoeZipperRequest))
                .build();
    }
    
    @PutMapping("/zipper/update/{zipperName}")
    public ApiResponse updateShoeZipper(@PathVariable String zipperName, @RequestBody @Valid ShoeZipperRequest shoeZipperRequest) {
        
        return ApiResponse.builder()
                .result(shoeService.updateShoeZipper(zipperName, shoeZipperRequest))
                .build();
    }
    
    @GetMapping("/zipper/{zipperName}")
    public ApiResponse getShoeZipper(@PathVariable String zipperName) {
        
        return ApiResponse.builder()
                .result(shoeService.getShoeZipper(zipperName))
                .build();
    }
    
    @GetMapping("/zippers")
    public ApiResponse getShoeZippers() {
        
        return ApiResponse.builder()
                .result(shoeService.getShoeZippers())
                .build();
    }
    
}
