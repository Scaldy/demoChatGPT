package com.example.demo.controller;

import com.example.demo.dto.UsuarioDTO;
import com.example.demo.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/usuarios")
    public String registrar(@RequestBody UsuarioDTO request) {
        usuarioService.registrarUsuario(request.getEmail(), request.getNombre());
        return "Usuario registrado: " + request.getNombre();
    }

    @GetMapping("/usuarios/{nombre}")
    public String hola(@PathVariable String nombre) {
        return "Hola " + nombre;
    }
}


