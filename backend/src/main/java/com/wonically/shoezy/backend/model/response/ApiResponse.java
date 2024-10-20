package com.wonically.shoezy.backend.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.ResponseStatus;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@ResponseStatus
public class ApiResponse <T> {
    @Builder.Default
    int code = 1000;
    String message;
    T result;
}
