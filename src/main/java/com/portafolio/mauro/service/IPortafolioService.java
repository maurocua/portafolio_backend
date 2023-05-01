package com.portafolio.mauro.service;

import com.portafolio.mauro.model.Contacto;
import com.portafolio.mauro.model.Estudio;
import com.portafolio.mauro.model.Habilidad;
import com.portafolio.mauro.model.Idioma;
import com.portafolio.mauro.model.Principal;
import com.portafolio.mauro.model.Proyecto;
import com.portafolio.mauro.model.Redes;
import java.util.List;

public interface IPortafolioService {
    public Principal verDatos();
    public void cargarDatos(Principal data);
    //public void editarDatos(Principal data);
    
    public List<Estudio> verEstudios();
    public void cargarEstudio(Estudio estu);
    public void eliminarEstudio(Long id);
    //public void editarEstudio(Estudio estu);
    
    public List<Habilidad> verHabilidades();
    public void cargarHabilidad(Habilidad hab);
    public void eliminarHabilidad(Long id);
    //public void editarHabilidad(Long id);
    
    public List<Idioma> verIdiomas();
    public void cargarIdiomas(Idioma idio);
    public void eliminarIdioma(Long id);
    //public void editarIdioma(Long id);
    
    public List<Proyecto> verProyectos();
    public void cargarProyectos(Proyecto proy);
    public void eliminarProyecto(Long id);
    //public void editarProyecto(Long id);
    
    public List<Redes> verRedes();
    public void cargarRed(Redes red);
    public void eliminarRed(Long id);
    //public void editarRed(Long id);
    
    public void guardarContacto(Contacto cont);
    public List<Contacto> verContactos();
}
