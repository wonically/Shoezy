package com.wonically.shoezy.backend.model.request.order;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDetailsRequest {
    
    @NotBlank(message = "INVALID_ID")
    UUID orderId;
    
    @NotBlank(message = "INVALID_ID")
    UUID shoeDetailsId;
    
    @NotNull(message = "INVALID_QUANTITY")
    @Min(value = 1, message = "INVALID_QUANTITY")
    int quantity;
    
    @NotNull(message = "INVALID_PRICE")
    float totalItemPrice;
    
}
