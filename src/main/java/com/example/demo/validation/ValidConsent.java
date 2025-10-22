package com.example.demo.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ConsentValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidConsent {
    String message() default "El consentimiento no es válido";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

