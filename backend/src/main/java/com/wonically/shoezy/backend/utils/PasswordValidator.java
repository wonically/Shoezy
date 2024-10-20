package com.wonically.shoezy.backend.utils;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<Password, String> {
    @Override
    public void initialize(Password password) {
    }

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {
        if (password != null) {
            return (!password.matches("^(.{0,7}|[^0-9]*|[^A-Z]*|[^a-z]*|[a-zA-Z0-9]*)$"));
        } else {
            return true;
        }
    }
}
