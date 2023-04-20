package com.portafolio.mauro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Estudio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_estudio;
    private String nombre_estudio;
    private String nivel;

    public Estudio() {
    }

    public Estudio(String nombre_estudio, String nivel) {
        this.nombre_estudio = nombre_estudio;
        this.nivel = nivel;
    }
    
    
}
