package com.ap.ap.service;

import com.ap.ap.exception.UsuarioNotFoundException;
import com.ap.ap.model.Usuario;
import com.ap.ap.repo.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class UsuarioService {

    private final UsuarioRepo usuarioRepo;
    @Autowired
    public UsuarioService (UsuarioRepo usuarioRepo) {this.usuarioRepo=usuarioRepo;}

    public Usuario addUsuario(Usuario usuario){
        usuario.setUsuarioCode(UUID.randomUUID().toString());
        return usuarioRepo.save(usuario);
    }
    public List<Usuario> findAllUsuarios()
    {return usuarioRepo.findAll();}

    public Usuario updateUsuario(Usuario usuario)
    {return usuarioRepo.save(usuario);}

    public  Usuario findUsuarioById(Long id)
    {return usuarioRepo.findUsuarioById(id).orElseThrow(()->new UsuarioNotFoundException("ID de usuario"+id+"no fue encontrado" ));}

    public void deleteUsuario(Long id)
    {usuarioRepo.deleteUsuarioById(id);
    }
}



    
