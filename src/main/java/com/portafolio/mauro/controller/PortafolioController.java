package com.portafolio.mauro.controller;

import com.portafolio.mauro.model.Contacto;
import com.portafolio.mauro.model.Estudio;
import com.portafolio.mauro.model.Habilidad;
import com.portafolio.mauro.model.Idioma;
import com.portafolio.mauro.model.Principal;
import com.portafolio.mauro.model.Proyecto;
import com.portafolio.mauro.model.Redes;
import com.portafolio.mauro.repository.RedesRepository;
import com.portafolio.mauro.service.IPortafolioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://portafolio-frontend-mauroc.web.app/")
@RestController
public class PortafolioController {
    @Autowired
    public IPortafolioService portaServ;
    
    @Autowired
    public RedesRepository redesRepo;
    
    //public Principal datosPrincipales = portaServ.verDatos();
    
    @GetMapping("")
    @ResponseBody
    public Principal mostrarDatos(){
        return portaServ.verDatos();
    }
    
    @GetMapping("/estudios")
    @ResponseBody
    public List<Estudio> mostrarEstudios(){
        return portaServ.verEstudios();
    }
    
    @GetMapping("/habilidades")
    @ResponseBody
    public List<Habilidad> mostrarHabilidades(){
        return portaServ.verHabilidades();
    }
    
    @GetMapping("/idiomas")
    @ResponseBody
    public List<Idioma> mostrarIdiomas(){
        return portaServ.verIdiomas();
    }
    
    @GetMapping("/proyectos")
    @ResponseBody
    public List<Proyecto> mostrarProyectos(){
        return portaServ.verProyectos();
    }
    
    @GetMapping("/redes")
    @ResponseBody
    public List<Redes> mostrarRedes(){
        return portaServ.verRedes();
    }
    
    @PostMapping("/contacto")
    public void guardaContacto(@RequestBody Contacto cont){
        portaServ.guardarContacto(cont);
    }
    
    @PostMapping("")
    public void cargarDatos(@RequestBody Principal data){
        data.setLista_estudios(portaServ.verEstudios());
        data.setLista_habilidades(portaServ.verHabilidades());
        data.setLista_idiomas(portaServ.verIdiomas());
        data.setLista_proyectos(portaServ.verProyectos());
        data.setLista_redes(portaServ.verRedes());
        //data.setLista_contactos(portaServ.verContactos());
        
        portaServ.cargarDatos(data);
    }           
    
    @PutMapping("/editar")
    public void editarDatos(@RequestBody Principal data){
        cargarDatos(data);
    }
    
    @PostMapping("/estudios/cargar")
    public void cargarEstudio(@RequestBody Estudio estu){
        portaServ.cargarEstudio(estu);
        
        Principal datosPrincipales = portaServ.verDatos();
        datosPrincipales.setLista_estudios(portaServ.verEstudios());
        portaServ.cargarDatos(datosPrincipales);
    }
    
    @PutMapping("/estudios/editar")
    public void editarEstudio(@RequestBody Estudio estu){
        cargarEstudio(estu);
    }
    
    @DeleteMapping("/estudios/eliminar/{id}")
    public void eliminarEstudio(@PathVariable Long id){
        portaServ.eliminarEstudio(id);
    }
    
    @PostMapping("/habilidades/cargar")
    public void cargarHabilidad(@RequestBody Habilidad hab){
        portaServ.cargarHabilidad(hab);
        
        Principal datosPrincipales = portaServ.verDatos();
        datosPrincipales.setLista_habilidades(portaServ.verHabilidades());
        portaServ.cargarDatos(datosPrincipales);
    }
    
    @PutMapping("/habilidades/editar")
    public void editarHabilidad(@RequestBody Habilidad hab){
        cargarHabilidad(hab);
    }
    
    @DeleteMapping("/habilidades/eliminar/{id}")
    public void eliminarHabilidad(@PathVariable Long id){
        portaServ.eliminarHabilidad(id);
    }
    
    @PostMapping("/idiomas/cargar")
    public void cargarIdiomas(@RequestBody Idioma idio){
        portaServ.cargarIdiomas(idio);
        
        Principal datosPrincipales = portaServ.verDatos();
        datosPrincipales.setLista_idiomas(portaServ.verIdiomas());
        portaServ.cargarDatos(datosPrincipales);
    }
    
    @PutMapping("/idiomas/editar")
    public void editarIdioma(@RequestBody Idioma idio){
        cargarIdiomas(idio);
    }
    
    @DeleteMapping("/idiomas/eliminar/{id}")
    public void eliminarIdioma(@PathVariable Long id){
        portaServ.eliminarIdioma(id);
    }
    
    @PostMapping("/proyectos/cargar")
    public void cargarProyectos(@RequestBody Proyecto proy){   
        portaServ.cargarProyectos(proy);
        
        Principal datosPrincipales = portaServ.verDatos();
        datosPrincipales.setLista_proyectos(portaServ.verProyectos());
        portaServ.cargarDatos(datosPrincipales);
    }
    
    @PutMapping("/proyectos/editar")
    public void editarProyecto(@RequestBody Proyecto proy){
        cargarProyectos(proy);
    }
    
    @DeleteMapping("/proyectos/eliminar/{id}")
    public void eliminarProyecto(@PathVariable Long id){
        portaServ.eliminarProyecto(id);
    } 
    
    @PostMapping("/redes/cargar")
    public void cargarRed(@RequestBody Redes red){ 
        portaServ.cargarRed(red);
        
        Principal datosPrincipales = portaServ.verDatos();
        datosPrincipales.setLista_redes(portaServ.verRedes());
        portaServ.cargarDatos(datosPrincipales);
    }
    
    @PutMapping("/redes/editar")
    public void editared(@RequestBody Redes red){
        cargarRed(red);
    }
    
    @DeleteMapping("/redes/eliminar/{id}")
    public void eliminarRed(@PathVariable Long id){ 
        portaServ.eliminarRed(id);
    }
    
}
