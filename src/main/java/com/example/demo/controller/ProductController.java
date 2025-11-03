package com.example.demo.controller;

import com.example.demo.dto.ProductDTO;
import com.example.demo.validation.OnCreate;
import com.example.demo.validation.OnUpdate;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @PostMapping
    public ResponseEntity<String> create(@RequestBody @Validated(OnCreate.class) ProductDTO dto) {
        return ResponseEntity.ok("Producto creado correctamente");
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody @Validated(OnUpdate.class) ProductDTO dto) {
        return ResponseEntity.ok("Producto actualizado correctamente");
    }
}
