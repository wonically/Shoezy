package com.wonically.shoezy.backend.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error.", HttpStatus.INTERNAL_SERVER_ERROR),
    UNAUTHORIZED(401, "You do not have permission.", HttpStatus.FORBIDDEN),
    UNAUTHENTICATED(403, "Unauthenticated.", HttpStatus.UNAUTHORIZED),
    INVALID(400, "Input is invalid.", HttpStatus.BAD_REQUEST),
    NOT_EXIST(400, "Not existed.", HttpStatus.BAD_REQUEST),
    EXISTED(400, "Already existed.", HttpStatus.BAD_REQUEST);
    
    final int code;
    
    final String message;
    
    final HttpStatusCode httpStatusCode;
}
