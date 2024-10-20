package com.wonically.shoezy.backend.utils;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Constraint(validatedBy = StatusValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidStatus {
    Class<? extends Enum<?>> status();
    String message() default "INVALID_STATUS";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
