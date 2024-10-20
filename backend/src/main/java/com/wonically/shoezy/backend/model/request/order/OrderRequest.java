package com.wonically.shoezy.backend.model.request.order;

import com.wonically.shoezy.backend.utils.OrderStatus;
import com.wonically.shoezy.backend.utils.PaymentStatus;
import com.wonically.shoezy.backend.utils.ValidStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderRequest {
    
    @NotBlank(message = "INVALID_CODE")
    String customerCode;
    
    @NotBlank(message = "INVALID_CODE")
    String staffCode;
    
    Instant paymentTime;
    
    Instant paymentMethod;
    
    @NotBlank(message = "INVALID_PAYMENT_STATUS")
    @ValidStatus(status = PaymentStatus.class, message = "INVALID_PAYMENT_STATUS")
    String paymentStatus;
    
    Instant deliveryDate;
    
    @NotNull(message = "INVALID_PRICE")
    float deliveryFee;
    
    Instant finishDate;
    
    @NotBlank(message = "INVALID_ORDER_STATUS")
    @ValidStatus(status = OrderStatus.class, message = "INVALID_ORDER_STATUS")
    String orderStatus;
    
    @NotNull(message = "INVALID_PRICE")
    float totalPrice;
    
}
