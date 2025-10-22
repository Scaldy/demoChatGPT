package com.example.demo;

import com.example.demo.service.EmailService;
import com.example.demo.service.UsuarioService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.context.ApplicationEventPublisher;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioServiceTest {

    @Test
    void testRegistro() {
        ApplicationEventPublisher publisher = Mockito.mock(ApplicationEventPublisher.class);
        EmailService mockEmail = Mockito.mock(EmailService.class);
        String mail = "tubamar@hotmail.com";

        UsuarioService service = new UsuarioService(mockEmail, publisher);

        String resultado = service.registrarUsuario(mail,"Marcelo");
        assertEquals("Registrado Marcelo", resultado);

        Mockito.verify(mockEmail).enviarCorreo(mail);
    }
}

