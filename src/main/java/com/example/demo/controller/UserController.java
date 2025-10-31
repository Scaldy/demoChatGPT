package com.example.demo.controller;

import com.example.demo.dto.GeneralResponseDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.dto.UserRegisterDTO;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }

    @GetMapping("/search")
    public List<User> findByName(@RequestParam String name) {
        return userService.findByName(name);
    }

    @GetMapping("/older-than/{age}")
    public List<User> findOlderThan(@PathVariable int age) {
        return userService.findOlderThan(age);
    }

    @PostMapping("/register")
    public ResponseEntity<GeneralResponseDTO> register(@RequestBody @Valid UserRegisterDTO user) {
        return ResponseEntity.ok(new GeneralResponseDTO("Usuario registrado correctamente"));
    }

    @PostMapping("/validate")
    public ResponseEntity<String> validate(@RequestBody @Valid UserDTO user) {
        return ResponseEntity.ok("Usuario válido");
    }
}
