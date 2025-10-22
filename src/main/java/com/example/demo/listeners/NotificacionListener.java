package com.example.demo.listeners;

import com.example.demo.events.UsuarioCreadoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class NotificacionListener {
    private static final Logger log = LoggerFactory.getLogger(NotificacionListener.class);

    @Async
    @EventListener
    public void enviarCorreo(UsuarioCreadoEvent event) {
        log.info("📨 Enviando correo a {}", event.getEmail());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        log.info("✅ Correo enviado correctamente a {}", event.getEmail());
    }
}
