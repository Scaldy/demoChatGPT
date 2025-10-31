package com.example.demo;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class UsuarioRepositoryTest {

    @Autowired
    private UsuarioRepository repo;

    @Test
    void deberiaGuardarYBuscarUsuario() {
        Usuario u = new Usuario();
        u.setNombre("Marcelo");
        u.setEmail("marcelo@mail.com");
        repo.save(u);

        Usuario encontrado = repo.findByEmail("marcelo@mail.com");
        assertEquals("Marcelo", encontrado.getNombre());
    }
}
