package com.wonically.shoezy.backend.entity.user;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wonically.shoezy.backend.entity.order.Order;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@SuperBuilder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "customer")
@Entity
public class Customer extends User {
    
    @JsonBackReference
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "order")
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    Set<Order> order;
    
    @Column(name = "total_spending")
    float totalSpending;
    
    @Column(name = "total_orders")
    int totalOrders;
    
    @ManyToMany
    Set<Role> role;
    
    @JsonBackReference
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "address")
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    Set<Address> address;
    
}
