package com.wonically.shoezy.backend.entity.user;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "address")
@Entity
public class Address {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    UUID addressId;
    
    @Column(name = "recipient_name")
    String recipientName;
    
    @Column(name = "recipient_phone")
    String recipientPhone;
    
    @Column(name = "address_line_1")
    String addressLine1;
    
    @Column(name = "address_line_2")
    String addressLine2;
    
    @Column(name = "city")
    String city;
    
    @Column(name = "state")
    String state;
    
    @Column(name = "province")
    String province;
    
    @Column(name = "country")
    String country;
    
    @Column(name = "zip_code")
    String zipCode;
    
    @ManyToOne
    @JoinColumn(name = "customer")
    Customer customer;
    
}
