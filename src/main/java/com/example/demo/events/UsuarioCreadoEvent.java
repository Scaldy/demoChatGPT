package com.example.demo.events;

public class UsuarioCreadoEvent {
    private final String email;
    private final String nombre;

    public UsuarioCreadoEvent(String email, String nombre) {
        this.email = email;
        this.nombre = nombre;
    }

    public String getEmail() { return email; }
    public String getNombre() { return nombre; }
}
