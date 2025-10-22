package com.example.demo;

import com.example.demo.service.CalculadoraService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraServiceTest {

    @Test
    void testSuma() {
        CalculadoraService service = new CalculadoraService();
        int resultado = service.sumar(2, 3);
        assertEquals(5, resultado);
    }
}

