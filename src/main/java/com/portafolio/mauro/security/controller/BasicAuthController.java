package com.portafolio.mauro.security.controller;

import com.portafolio.mauro.security.AuthenticationBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BasicAuthController {
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path = "/status")
    public AuthenticationBean basicauth() {
        return new AuthenticationBean("Usuario autenticado");
    }
}