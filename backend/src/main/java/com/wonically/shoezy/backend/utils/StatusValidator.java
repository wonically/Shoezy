package com.wonically.shoezy.backend.utils;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StatusValidator implements ConstraintValidator<ValidStatus, String> {
    private List<String> validValues;
    
    @Override
    public void initialize(ValidStatus annotation) {
        validValues = Stream.of(annotation.status().getEnumConstants())
                .map(Enum::name)
                .collect(Collectors.toList());
    }
    
    @Override
    public boolean isValid(String status, ConstraintValidatorContext context) {
        if (status == null) {
            return false;
        }
        
        return validValues.contains(status);
    }
}
