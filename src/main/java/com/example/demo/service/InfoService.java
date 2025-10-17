package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String version;

    public String getInfo() {
        return "Aplicación: " + appName + " - Versión: " + version;
    }
}
