package com.example.demo;

import com.example.demo.service.CalculadoraService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraServiceTest {

    @Test
    void deberiaSumarCorrectamente() {
        CalculadoraService calc = new CalculadoraService();
        assertEquals(5, calc.sumar(2, 3));
    }
}
