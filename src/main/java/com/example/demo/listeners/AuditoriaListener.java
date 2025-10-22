package com.example.demo.listeners;

import com.example.demo.events.UsuarioCreadoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class AuditoriaListener {
    private static final Logger log = LoggerFactory.getLogger(AuditoriaListener.class);

    @EventListener
    public void registrarAuditoria(UsuarioCreadoEvent event) {
        log.info("🗒️ [AUDITORÍA] Usuario creado: {} ({})", event.getNombre(), event.getEmail());
    }
}
