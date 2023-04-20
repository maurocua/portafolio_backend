package com.portafolio.mauro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Redes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_contacto;
    private String red_social;
    private String link_contacto;

    public Redes() {
    }

    public Redes(String red_social, String link_contacto) {
        this.red_social = red_social;
        this.link_contacto = link_contacto;
    }
    
    
}
