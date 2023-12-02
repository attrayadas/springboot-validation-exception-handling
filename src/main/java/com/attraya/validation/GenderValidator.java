package com.attraya.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class GenderValidator implements ConstraintValidator<ValidateGender, String> {

    @Override
    public boolean isValid(String gender, ConstraintValidatorContext context) {
        List<String> genderTypes = Arrays.asList("Male", "Female");
        return genderTypes.contains(gender);
    }
}
