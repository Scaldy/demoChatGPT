package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public record AddressDTO(
        @NotBlank(message = "La calle no puede estar vacía")
        String street,

        @NotBlank(message = "La ciudad no puede estar vacía")
        String city
) {}

