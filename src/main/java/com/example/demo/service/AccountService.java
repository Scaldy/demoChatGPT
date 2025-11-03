package com.example.demo.service;

import com.example.demo.dto.AccountDTO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class AccountService {

    // método simula un retorno inválido
    @Valid
    public AccountDTO getAccount(Long id) {
        // en un caso real consultarías base de datos
//        return new AccountDTO(null, ""); // ❌ ambos inválidos
        return new AccountDTO(1L, "Cuenta Principal");
    }
}
