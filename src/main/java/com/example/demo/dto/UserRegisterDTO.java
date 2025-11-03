package com.example.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record UserRegisterDTO(
        @NotBlank(message = "El nombre no puede estar vacío")
        String name,

        @Email(message = "Debe ser un correo válido")
        String email,

        @Min(value = 18, message = "Debe ser mayor o igual a 18 años")
        int age
) {}

