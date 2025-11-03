package com.example.demo.dto;

import com.example.demo.validation.OnCreate;
import com.example.demo.validation.OnUpdate;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductDTO(
        @NotNull(groups = OnUpdate.class, message = "El ID es obligatorio al actualizar")
        Long id,

        @NotBlank(groups = OnCreate.class, message = "El nombre no puede estar vacío")
        String name,

        @Min(value = 1, groups = {OnCreate.class, OnUpdate.class}, message = "El stock debe ser mayor a 0")
        int stock
) {}
