package com.example.demo;

import com.example.demo.controller.UsuarioController;
import com.example.demo.service.UsuarioService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(UsuarioController.class)
class UsuarioControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private UsuarioService usuarioService; // 🔹 simulamos la capa de servicio

    @Test
    void deberiaResponderSaludo() throws Exception {
        when(usuarioService.registrar("Marcelo"))
                .thenReturn("Registrado Marcelo");

        mockMvc.perform(get("/usuarios/Marcelo"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hola Marcelo"));
    }
}


