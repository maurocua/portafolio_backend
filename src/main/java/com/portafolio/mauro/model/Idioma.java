package com.portafolio.mauro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Idioma {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_idioma;
    private String Idioma;
    private String nivel_idioma;

    public Idioma() {
    }

    public Idioma(String Idioma, String nivel_idioma) {
        this.Idioma = Idioma;
        this.nivel_idioma = nivel_idioma;
    }
    
    
}
