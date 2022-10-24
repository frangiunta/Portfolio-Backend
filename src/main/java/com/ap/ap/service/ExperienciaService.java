package com.ap.ap.service;
import com.ap.ap.model.Experiencia;
import com.ap.ap.repo.ExperienciaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ExperienciaService {
    private final ExperienciaRepo experienciaRepo;
    @Autowired
    public ExperienciaService(ExperienciaRepo experienciaRepo) {
        this.experienciaRepo = experienciaRepo;
    }
    public Experiencia addExperiencia(Experiencia experiencia){
        experiencia.setExperienciaCode(UUID.randomUUID().toString());
        return experienciaRepo.save(experiencia);
    }
    public List<Experiencia> findAllExperiencia()
    {return experienciaRepo.findAll();}

    public Experiencia updateExperiencia(Experiencia experiencia)
    {return experienciaRepo.save(experiencia);}

    public void deleteExperiencia(Long id)
    {experienciaRepo.deleteExperienciaById(id);
    }
}


