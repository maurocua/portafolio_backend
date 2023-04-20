package com.portafolio.mauro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_proyecto;
    private String proyecto;
    private String link_proyecto;

    public Proyecto() {
    }

    public Proyecto(String proyecto, String link_proyecto) {
        this.proyecto = proyecto;
        this.link_proyecto = link_proyecto;
    }
    
    
}
