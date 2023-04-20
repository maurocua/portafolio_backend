package com.portafolio.mauro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_habilidad;
    private String habilidad;
    private String nivel_hab;

    public Habilidad() {
    }

    public Habilidad(String habilidad, String nivel_hab) {
        this.habilidad = habilidad;
        this.nivel_hab = nivel_hab;
    }
    
}
