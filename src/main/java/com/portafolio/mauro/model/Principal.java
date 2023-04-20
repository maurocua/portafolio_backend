package com.portafolio.mauro.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Principal {
    @Id
    private Long id;
    private String nombre_completo;
    private int edad;
    private String ruta_foto;
    private String acerca_de;
    private String descripcion;
    private String ubicacion;
    
    @OneToMany
    private List<Estudio> lista_estudios;
    
    @OneToMany
    private List<Habilidad> lista_habilidades;
            
    @OneToMany
    private List<Idioma> lista_idiomas;
    
    @OneToMany
    private List<Proyecto> lista_proyectos;
    
    @OneToMany
    private List<Contacto> lista_contactos;
    
    @OneToMany
    private List<Redes> lista_redes;
    
    public Principal() {
        this.id = 1L;
    }

    public Principal(String nombre_completo, int edad, String ruta_foto, String acerca_de, String descripcion, String ubicacion, List<Estudio> lista_estudios, List<Habilidad> lista_habilidades, List<Idioma> lista_idiomas, List<Proyecto> lista_proyectos, List<Contacto> lista_contactos, List<Redes> lista_redes) {
        this.id = 1L;
        this.nombre_completo = nombre_completo;
        this.edad = edad;
        this.ruta_foto = ruta_foto;
        this.acerca_de = acerca_de;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.lista_estudios = lista_estudios;
        this.lista_habilidades = lista_habilidades;
        this.lista_idiomas = lista_idiomas;
        this.lista_proyectos = lista_proyectos;
        this.lista_contactos = lista_contactos;
        this.lista_redes = lista_redes;
    }

    
    
    
}
