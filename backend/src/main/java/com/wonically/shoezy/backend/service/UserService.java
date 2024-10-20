package com.wonically.shoezy.backend.service;

import com.wonically.shoezy.backend.exception.AppException;
import com.wonically.shoezy.backend.exception.ErrorCode;
import com.wonically.shoezy.backend.model.mapper.user.AddressMapper;
import com.wonically.shoezy.backend.model.mapper.user.CustomerMapper;
import com.wonically.shoezy.backend.model.mapper.user.StaffMapper;
import com.wonically.shoezy.backend.model.request.user.AddressRequest;
import com.wonically.shoezy.backend.model.request.user.CustomerRequest;
import com.wonically.shoezy.backend.model.request.user.StaffRequest;
import com.wonically.shoezy.backend.model.response.user.AddressResponse;
import com.wonically.shoezy.backend.model.response.user.CustomerResponse;
import com.wonically.shoezy.backend.model.response.user.StaffResponse;
import com.wonically.shoezy.backend.repository.AddressRepository;
import com.wonically.shoezy.backend.repository.CustomerRepository;
import com.wonically.shoezy.backend.repository.StaffRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserService {
    
    @Autowired
    AddressRepository addressRepository;
    
    @Autowired
    AddressMapper addressMapper;
    
    @Autowired
    CustomerRepository customerRepository;
    
    @Autowired
    CustomerMapper customerMapper;
    
    @Autowired
    StaffRepository staffRepository;
    
    @Autowired
    StaffMapper staffMapper;
    
    public AddressResponse createAddress(AddressRequest addressRequest) {
        
        return addressMapper.toAddressResponse(addressRepository.save(addressMapper.toAddress(addressRequest)));
    }
    
    public AddressResponse updateAddress(UUID addressId, AddressRequest addressRequest) {
        
        if (addressRepository.existsByAddressId(addressId)) {
            return addressMapper.toAddressResponse(addressRepository.save(addressMapper.toAddress(addressRepository.findByAddressId(addressId), addressRequest)));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public String deleteAddress(UUID addressId) {
        
        if (addressRepository.existsByAddressId(addressId)) {
            addressRepository.deleteByAddressId(addressId);
            return "success";
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public AddressResponse getAddress(UUID addressId) {
        
        if (addressRepository.existsByAddressId(addressId)) {
            return addressMapper.toAddressResponse(addressRepository.findByAddressId(addressId));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public List<AddressResponse> getAddresses() {
        
        return addressRepository.findAll().stream().map(addressMapper::toAddressResponse).toList();
    }
    
    public CustomerResponse createCustomer(CustomerRequest customerRequest) {
        
        if (customerRepository.existsByCode(customerRequest.getCode())) {
            throw new AppException(ErrorCode.EXISTED);
        } else {
            return customerMapper.toCustomerResponse(customerRepository.save(customerMapper.toCustomer(customerRequest)));
        }
    }
    
    public CustomerResponse updateCustomer(String code, CustomerRequest customerRequest) {
        
        if (customerRepository.existsByCode(code)) {
            return customerMapper.toCustomerResponse(customerRepository.save(customerMapper.toCustomer(customerRepository.findByCode(code), customerRequest)));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public CustomerResponse getCustomer(String code) {
        
        if (customerRepository.existsByCode(code)) {
            return customerMapper.toCustomerResponse(customerRepository.findByCode(code));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public List<CustomerResponse> getCustomers() {
        
        return customerRepository.findAll().stream().map(customerMapper::toCustomerResponse).toList();
    }
    
    public StaffResponse createStaff(StaffRequest staffRequest) {
        
        if (staffRepository.existsByCode(staffRequest.getCode())) {
            throw new AppException(ErrorCode.EXISTED);
        } else {
            return staffMapper.toStaffResponse(staffRepository.save(staffMapper.toStaff(staffRequest)));
        }
    }
    
    public StaffResponse updateStaff(String code, StaffRequest staffRequest) {
        
        if (staffRepository.existsByCode(code)) {
            return staffMapper.toStaffResponse(staffRepository.save(staffMapper.toStaff(staffRepository.findByCode(code), staffRequest)));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public StaffResponse getStaff(String code) {
        
        if (staffRepository.existsByCode(code)) {
            return staffMapper.toStaffResponse(staffRepository.findByCode(code));
        } else {
            throw new AppException(ErrorCode.NOT_EXIST);
        }
    }
    
    public List<StaffResponse> getStaffs() {
        
        return staffRepository.findAll().stream().map(staffMapper::toStaffResponse).toList();
    }
    
}
