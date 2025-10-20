package com.example.demo.controller;

import com.example.demo.config.AppProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {

    private final AppProperties appProperties;

    @Value("${spring.profiles.active}")
    private String activeProfile;

    public ConfigController(AppProperties appProperties) {
        this.appProperties = appProperties;
    }

    @GetMapping("/info")
    public String getInfo2() {
        return """
            <h3>Spring Profile activo: %s</h3>
            <p>App Name: %s</p>
            <p>Versión: %s</p>
            <p>Feature habilitado: %s</p>
            """.formatted(
                activeProfile,
                appProperties.getName(),
                appProperties.getVersion(),
                appProperties.getFeature().isEnabled()
        );
    }
}