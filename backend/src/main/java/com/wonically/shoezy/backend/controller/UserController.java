package com.wonically.shoezy.backend.controller;

import com.wonically.shoezy.backend.model.request.user.AddressRequest;
import com.wonically.shoezy.backend.model.request.user.CustomerRequest;
import com.wonically.shoezy.backend.model.request.user.StaffRequest;
import com.wonically.shoezy.backend.model.response.ApiResponse;
import com.wonically.shoezy.backend.service.UserService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserController {
    
    @Autowired
    UserService userService;
    
    @PostMapping("/address/create")
    public ApiResponse createAddress(@RequestBody @Valid AddressRequest addressRequest) {
        
        return ApiResponse.builder()
                .result(userService.createAddress(addressRequest))
                .build();
    }
    
    @PutMapping("/address/update/{addessId}")
    public ApiResponse updateAddress(@PathVariable UUID addressId, @RequestBody @Valid AddressRequest addressRequest) {
        
        return ApiResponse.builder()
                .result(userService.updateAddress(addressId, addressRequest))
                .build();
    }
    
    @DeleteMapping("/address/delete/{addressId}")
    public ApiResponse deleteAddress(@PathVariable UUID addressId) {
        
        return ApiResponse.builder()
                .result(userService.deleteAddress(addressId))
                .build();
    }
    
    @GetMapping("/address/{addressId}")
    public ApiResponse getAddress(@PathVariable UUID addressId) {
        
        return ApiResponse.builder()
                .result(userService.getAddress(addressId))
                .build();
    }
    
    @GetMapping("/addresses")
    public ApiResponse getAddresses() {
        
        return ApiResponse.builder()
                .result(userService.getAddresses())
                .build();
    }
    
    @PostMapping("/customer")
    public ApiResponse createCustomer(@RequestBody @Valid CustomerRequest customerRequest) {
        
        return ApiResponse.builder()
                .result(userService.createCustomer(customerRequest))
                .build();
    }
    
    @PutMapping("/customer/update/{code}")
    public ApiResponse updateCustomer(@PathVariable String code, @RequestBody @Valid CustomerRequest customerRequest) {
        
        return ApiResponse.builder()
                .result(userService.updateCustomer(code, customerRequest))
                .build();
    }
    
    @GetMapping("/customer/{code}")
    public ApiResponse getCustomer(@PathVariable String code) {
        
        return ApiResponse.builder()
                .result(userService.getCustomer(code))
                .build();
    }
    
    @GetMapping("/customers")
    public ApiResponse getCustomers() {
        
        return ApiResponse.builder()
                .result(userService.getCustomers())
                .build();
    }
    
    @PostMapping("/staff")
    public ApiResponse createStaff(@RequestBody @Valid StaffRequest staffRequest) {
        
        return ApiResponse.builder()
                .result(userService.createStaff(staffRequest))
                .build();
    }
    
    @PutMapping("/staff/update/{code}")
    public ApiResponse updateStaff(@PathVariable String code, @RequestBody @Valid StaffRequest staffRequest) {
        
        return ApiResponse.builder()
                .result(userService.updateStaff(code, staffRequest))
                .build();
    }
    
    @GetMapping("/staff/{code}")
    public ApiResponse getStaff(@PathVariable String code) {
        
        return ApiResponse.builder()
                .result(userService.getStaff(code))
                .build();
    }
    
    @GetMapping("/staffs")
    public ApiResponse getStaffs() {
        
        return ApiResponse.builder()
                .result(userService.getStaffs())
                .build();
    }
    
}
