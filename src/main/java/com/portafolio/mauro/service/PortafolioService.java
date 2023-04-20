package com.portafolio.mauro.service;

import com.portafolio.mauro.model.Contacto;
import com.portafolio.mauro.model.Estudio;
import com.portafolio.mauro.model.Habilidad;
import com.portafolio.mauro.model.Idioma;
import com.portafolio.mauro.model.Principal;
import com.portafolio.mauro.model.Proyecto;
import com.portafolio.mauro.model.Redes;
import com.portafolio.mauro.repository.ContactoRepository;
import com.portafolio.mauro.repository.EstudioRepository;
import com.portafolio.mauro.repository.HabilidadRepository;
import com.portafolio.mauro.repository.IdiomaRepository;
import com.portafolio.mauro.repository.PrincipalRepository;
import com.portafolio.mauro.repository.ProyectoRepository;
import com.portafolio.mauro.repository.RedesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortafolioService implements IPortafolioService{
    @Autowired
    public PrincipalRepository principalRepo;
    
    @Autowired
    public EstudioRepository estudioRepo;
    
    @Autowired
    public HabilidadRepository habilidadRepo;
    
    @Autowired
    public IdiomaRepository idiomaRepo;
    
    @Autowired
    public ProyectoRepository proyectoRepo;
    
    @Autowired
    public ContactoRepository contactoRepo;
    
    @Autowired
    public RedesRepository redesRepo;

    @Override
    public Principal verDatos() {
        return principalRepo.findById(1L).orElse(null);
    }

    @Override
    public List<Estudio> verEstudios() {
        return estudioRepo.findAll();
    }

    @Override
    public List<Habilidad> verHabilidades() {
        return habilidadRepo.findAll();
    }

    @Override
    public List<Idioma> verIdiomas() {
        return idiomaRepo.findAll();
    }

    @Override
    public List<Proyecto> verProyectos() {
        return proyectoRepo.findAll();
    }

    @Override
    public void guardarContacto(Contacto cont) {
        contactoRepo.save(cont);
    }

    @Override
    public List<Redes> verRedes() {
        return redesRepo.findAll();
    }

    @Override
    public void cargarDatos(Principal data) {
        principalRepo.save(data);
    }

    @Override
    public void cargarEstudio(Estudio estu) {
        estudioRepo.save(estu);
    }

    @Override
    public void eliminarEstudio(Long id) {
        estudioRepo.deleteById(id);
    }

    @Override
    public void cargarHabilidad(Habilidad hab) {
        habilidadRepo.save(hab);
    }

    @Override
    public void eliminarHabilidad(Long id) {
        habilidadRepo.deleteById(id);
    }

    @Override
    public void cargarIdiomas(Idioma idio) {
        idiomaRepo.save(idio);
    }

    @Override
    public void eliminarIdioma(Long id) {
        idiomaRepo.deleteById(id);    
    }

    @Override
    public void cargarProyectos(Proyecto proy) {
        proyectoRepo.save(proy);
    }

    @Override
    public void eliminarProyecto(Long id) {
        proyectoRepo.deleteById(id);
    }

    @Override
    public void cargarRed(Redes red) {
        redesRepo.save(red);
    }

    @Override
    public void eliminarRed(Long id) {
        redesRepo.deleteById(id);
    }

    @Override
    public List<Contacto> verContactos() {
        return contactoRepo.findAll();
    }
    
    
}
