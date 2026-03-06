package com.sistema.funcionarios.controller;

import com.sistema.funcionarios.dto.LoginRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class LoginController {

    @PostMapping("/api/login")
    public boolean login(@RequestBody LoginRequest dto) {
        return dto.getUsuario().equals("admin") && dto.getSenha().equals("123");
    }
}