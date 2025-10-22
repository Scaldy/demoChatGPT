package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private static final Logger log = LoggerFactory.getLogger(EmailService.class);

    public void enviarCorreo(String destinatario) {
        // En un caso real, acá podrías usar JavaMailSender o alguna API SMTP.
        log.info("📧 Enviando correo a {}", destinatario);

        try {
            Thread.sleep(2000); // simula tiempo de envío
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        log.info("✅ Correo enviado a {}", destinatario);
    }
}

