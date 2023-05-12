package com.portafolio.mauro.security;

import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    
    @GetMapping("/status")
    public ResponseEntity<?> checkAuthenticationStatus(HttpServletRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        boolean isAuthenticated = authentication != null && authentication.isAuthenticated();
        
        if (isAuthenticated) {
            return ResponseEntity.ok("Usuario autenticado");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuario no authenticado.");
        }
    }
}
