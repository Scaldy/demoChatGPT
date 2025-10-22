package com.example.demo.dto;

import com.example.demo.validation.ValidConsent;
import jakarta.validation.constraints.NotNull;

@ValidConsent
public record UserConsentDTO(
        @NotNull(message = "Debe indicar si acepta los términos")
        Boolean acceptedTerms,

        @NotNull(message = "Debe indicar si acepta la política de privacidad")
        Boolean acceptedPrivacy
) {}
