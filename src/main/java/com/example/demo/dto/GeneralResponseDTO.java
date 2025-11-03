package com.example.demo.dto;

import lombok.Data;

@Data
public class GeneralResponseDTO {
    private String respuesta;

    public GeneralResponseDTO(String respuesta) {
        this.respuesta = respuesta;
    }
}
