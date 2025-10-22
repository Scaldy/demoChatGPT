package com.example.demo.controller;

import com.example.demo.dto.UserConsentDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consent")
public class ConsentController {

    @PostMapping
    public ResponseEntity<String> validateConsent(@RequestBody @Valid UserConsentDTO dto) {
        return ResponseEntity.ok("Consentimiento válido");
    }
}

