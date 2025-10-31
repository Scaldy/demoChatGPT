package com.example.demo.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public record OrderRequest(
        @NotNull(message = "El cliente es obligatorio")
        Long customerId,

        @Valid
        @NotNull(message = "La dirección de envío es obligatoria")
        AddressDTO shippingAddress,

        @Valid
        @Size(min = 1, message = "Debe incluir al menos un ítem")
        List<ItemDTO> items
) {}

