package com.example.demo.service;

import com.example.demo.events.UsuarioCreadoEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UsuarioService {

    private static final Logger log = LoggerFactory.getLogger(UsuarioService.class);
    private final ApplicationEventPublisher publisher;

    public UsuarioService(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void registrarUsuario(String email, String nombre) {
        log.info("👤 Registrando usuario: {} ({})", nombre, email);

        // simulación de guardado
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Publicar evento
        publisher.publishEvent(new UsuarioCreadoEvent(email, nombre));

        log.info("✅ Usuario registrado y evento publicado");
    }
}
