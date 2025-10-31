package com.example.demo;

import com.example.demo.service.EmailService;
import com.example.demo.service.UsuarioService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.context.ApplicationEventPublisher;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UsuarioServiceTest {

    @Test
    void deberiaRegistrarYEnviarCorreo() {
        EmailService emailMock = Mockito.mock(EmailService.class);
        ApplicationEventPublisher publisher = Mockito.mock(ApplicationEventPublisher.class);

        UsuarioService usuarioService = new UsuarioService(emailMock, publisher);

        String resultado = usuarioService.registrar("Marcelo");

        assertEquals("Registrado Marcelo", resultado);
        verify(emailMock).enviarCorreo("Marcelo@mail.com");
    }
}

