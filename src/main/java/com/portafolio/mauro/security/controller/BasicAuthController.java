package com.portafolio.mauro.security.controller;

import com.portafolio.mauro.security.AuthenticationBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://portafolio-frontend-mauroc.web.app/")
@RestController
public class BasicAuthController {
    @CrossOrigin(origins = "https://portafolio-frontend-mauroc.web.app/")
    @GetMapping(path = "/status")
    public AuthenticationBean basicauth() {
        return new AuthenticationBean("Usuario autenticado");
    }
}