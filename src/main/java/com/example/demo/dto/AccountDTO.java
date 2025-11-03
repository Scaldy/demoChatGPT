package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AccountDTO(
        @NotNull(message = "El ID no puede ser nulo")
        Long id,

        @NotBlank(message = "El nombre es obligatorio")
        String name
) {}
