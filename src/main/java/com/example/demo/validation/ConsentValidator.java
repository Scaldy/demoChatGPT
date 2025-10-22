package com.example.demo.validation;

import com.example.demo.dto.UserConsentDTO;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ConsentValidator implements ConstraintValidator<ValidConsent, UserConsentDTO> {

    @Override
    public boolean isValid(UserConsentDTO dto, ConstraintValidatorContext context) {
        if (dto == null) return true;

        if (Boolean.TRUE.equals(dto.acceptedTerms()) && Boolean.FALSE.equals(dto.acceptedPrivacy())) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Debe aceptar la política de privacidad si acepta los términos")
                    .addPropertyNode("acceptedPrivacy")
                    .addConstraintViolation();
            return false;
        }
        return true;
    }
}
