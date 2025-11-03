package com.example.demo.dto;

import com.example.demo.validation.ValidUsername;
import jakarta.validation.constraints.NotBlank;

public record UserDTO(
        @NotBlank(message = "El nombre no puede estar vacío")
        @ValidUsername
        String username
) {}
