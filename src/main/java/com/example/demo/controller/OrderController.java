package com.example.demo.controller;


import com.example.demo.dto.OrderRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @PostMapping
    public ResponseEntity<String> createOrder(@RequestBody @Valid OrderRequest request) {
        return ResponseEntity.ok("Pedido registrado correctamente");
    }
}

