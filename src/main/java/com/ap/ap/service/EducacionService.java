package com.ap.ap.service;

import com.ap.ap.model.Educacion;
import com.ap.ap.repo.EducacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EducacionService {
    private final EducacionRepo educacionRepo;
    @Autowired
    public EducacionService (EducacionRepo educacionRepo)
    {this.educacionRepo = educacionRepo;}

    public Educacion addEducacion(Educacion educacion) {
        educacion.setEducacionCode(UUID.randomUUID().toString());
        return educacionRepo.save(educacion);}

    public List<Educacion> findAllEducacions()
    {return educacionRepo.findAll();}
        public Educacion updateEducacion (Educacion educacion)
        {return educacionRepo.save(educacion);}

        public void deleteEducacion(Long id)
         {educacionRepo.deleteEducacionById(id);}
    }
