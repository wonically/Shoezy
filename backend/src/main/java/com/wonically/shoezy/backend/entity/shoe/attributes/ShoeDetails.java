package com.wonically.shoezy.backend.entity.shoe.attributes;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wonically.shoezy.backend.entity.order.OrderDetails;
import com.wonically.shoezy.backend.entity.shoe.Shoe;
import com.wonically.shoezy.backend.utils.Status;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "shoe_details")
@Entity
public class ShoeDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    UUID detailsId;
    
    @ManyToOne
    @JoinColumn(name = "shoe")
    Shoe shoe;
    
    @ManyToOne
    @JoinColumn(name = "size")
    ShoeSize shoeSize;
    
    @ManyToOne
    @JoinColumn(name = "color")
    ShoeColor shoeColor;
    
    @Column(name = "unit_price")
    float unitPrice;
    
    @Column(name = "stock_quantity")
    int stockQuantity;
    
    @Column(name = "status")
    String detailsStatus;
    
    @JsonBackReference
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "order_details")
    @OneToMany(mappedBy = "shoeDetails", fetch = FetchType.LAZY)
    Set<OrderDetails> orderDetails;
    
    //Default logging
    @Column(name = "date_created")
    @CreationTimestamp
    Instant dateCreated;
    
    @Column(name = "created_by")
    @CreatedBy
    UUID createdBy;
    
    @Column(name = "date_updated")
    @UpdateTimestamp
    Instant dateUpdated;
    
    @Column(name = "updated_by")
    @LastModifiedBy
    UUID updatedBy;
    
}
