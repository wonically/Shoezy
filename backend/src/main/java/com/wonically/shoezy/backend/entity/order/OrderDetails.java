package com.wonically.shoezy.backend.entity.order;

import com.wonically.shoezy.backend.entity.shoe.attributes.ShoeDetails;
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
@Table(name = "order_details")
@Entity
public class OrderDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    UUID orderDetailsId;
    
    @ManyToOne
    @JoinColumn(name = "`order`")
    Order order;
    
    @ManyToOne
    @JoinColumn(name = "shoe_details")
    ShoeDetails shoeDetails;
    
    @Column(name = "quantity")
    int quantity;
    
    @Column(name = "total_item_price")
    float totalItemPrice;
    
}
