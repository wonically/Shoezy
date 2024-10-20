package com.wonically.shoezy.backend.utils;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PasswordValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Password {
    String message() default "INVALID_PASSWORD";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
