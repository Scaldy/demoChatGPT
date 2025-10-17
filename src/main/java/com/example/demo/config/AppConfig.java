package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!dev & !prod")
public class AppConfig {

    @Bean
    public MessageService messageService() {
        return new MessageService("Mensaje generado desde AppConfig");
    }
}