package com.wonically.shoezy.backend.entity.order;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wonically.shoezy.backend.entity.user.Customer;
import com.wonically.shoezy.backend.entity.user.Staff;
import com.wonically.shoezy.backend.utils.OrderStatus;
import com.wonically.shoezy.backend.utils.PaymentStatus;
import com.wonically.shoezy.backend.utils.ValidStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "`order`")
@Entity
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    UUID orderId;
    
    @ManyToOne
    @JoinColumn(name = "customer")
    Customer customer;
    
    @ManyToOne
    @JoinColumn(name = "staff")
    Staff staff;
    
    @Column(name = "order_time")
    @CreationTimestamp
    Instant orderTime;
    
    @Column(name = "payment_time")
    Instant paymentTime;
    
    @Column(name = "payment_method")
    Instant paymentMethod;
    
    @Column(name = "payment_status")
    @ValidStatus(status = PaymentStatus.class, message = "INVALID_PAYMENT_STATUS")
    String paymentStatus;
    
    @Column(name = "delivery_date")
    Instant deliveryDate;
    
    @Column(name = "delivery_fee")
    float deliveryFee;
    
    @Column(name = "finish_date")
    Instant finishDate;
    
    @Column(name = "status")
    @ValidStatus(status = OrderStatus.class, message = "INVALID_ORDER_STATUS")
    String orderStatus;
    
    @Column(name = "total_price")
    float totalPrice;
    
    @JsonBackReference
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "order_details")
    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
    Set<OrderDetails> orderDetails;
    
}
