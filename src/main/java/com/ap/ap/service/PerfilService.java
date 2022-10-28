package com.ap.ap.service;

import com.ap.ap.exception.UsuarioNotFoundException;
import com.ap.ap.model.Perfil;
import com.ap.ap.repo.PerfilRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class PerfilService {

    private final PerfilRepo perfilRepo;
    @Autowired
    public PerfilService(PerfilRepo perfilRepo) {this.perfilRepo = perfilRepo;}

    public Perfil addPerfil(Perfil perfil){
        perfil.setPerfilCode(UUID.randomUUID().toString());
        return perfilRepo.save(perfil);
    }
    public List<Perfil> findAllPerfil()
    {return perfilRepo.findAll();}

    public Perfil updatePerfil(Perfil perfil)
    {return perfilRepo.save(perfil);}

    public Perfil findPerfilById(Long id)
    {return perfilRepo.findPerfilById(id).orElseThrow(()->new UsuarioNotFoundException("ID de usuario"+id+"no fue encontrado" ));}

    public void deletePerfil(Long id)
    {
        perfilRepo.deletePerfilById(id);
    }
}



    
