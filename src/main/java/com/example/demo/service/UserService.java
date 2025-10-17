package com.example.demo.service;

import com.example.demo.DemoApplication;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserService {
    public String getUser() {
        return "Hola Marcelo, Spring Boot está corriendo correctamente.";
    }

    public String getInfo() {
        return "Demo Application - Hora: " + LocalDateTime.now();
    }
}
