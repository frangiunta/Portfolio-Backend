package com.ap.ap.service;

import com.ap.ap.model.Proyectos;
import com.ap.ap.repo.ProyectosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ProyectosService {
    private final ProyectosRepo proyectosRepo;
    @Autowired
    public ProyectosService(ProyectosRepo proyectosRepo) {
        this.proyectosRepo = proyectosRepo;
    }
    public Proyectos addProyecto(Proyectos proyectos){
        proyectos.setProyectoCode(UUID.randomUUID().toString());
        return proyectosRepo.save(proyectos);
    }
    public List<Proyectos> findAllProyecto()
    {return proyectosRepo.findAll();}

    public Proyectos updateProyecto(Proyectos proyectos)
    {return proyectosRepo.save(proyectos);}

    public void deleteProyecto(Long id)
    {
        proyectosRepo.deleteProyectoById(id);
    }}