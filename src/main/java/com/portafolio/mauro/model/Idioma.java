package com.portafolio.mauro.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Idioma {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_idioma;
    private String idioma;
    private String nivel_idioma;
    //private Long principal_id;//////////////
    
    //@ManyToOne
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "principal_id")
//    @JsonBackReference///////////////////////////////
//    private Principal principal;
    
    public Idioma() {
    }

    public Idioma(String Idioma, String nivel_idioma) {
        this.idioma = Idioma;
        this.nivel_idioma = nivel_idioma;
        //this.principal_id=1L;////////////////////////////////
    }
    
    
}
