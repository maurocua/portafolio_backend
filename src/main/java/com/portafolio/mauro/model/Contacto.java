package com.portafolio.mauro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_contacto;
    private String nombre_contacto;
    private String numero_telefono;
    private String mail;
    private String mensaje;

    public Contacto() {
    }

    public Contacto(String mail, String mensaje) {
        this.mail = mail;
        this.mensaje = mensaje;
    }
    
    
}
