package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public void enviarCorreo(String destinatario) {
        System.out.println("Enviando correo a " + destinatario);
    }
}

