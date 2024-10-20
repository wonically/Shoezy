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
@Table(name = "staff")
@Entity
public class Staff extends User {
    
    @JsonBackReference
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "order")
    @OneToMany(mappedBy = "staff", fetch = FetchType.LAZY)
    Set<Order> order;
    
    @JsonBackReference
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "assignment")
    @OneToMany(mappedBy = "staff", fetch = FetchType.LAZY)
    Set<StaffAssignment> staffAssignment;
    
}
