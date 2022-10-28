package com.ap.ap.controller;

import com.ap.ap.model.Perfil;
import com.ap.ap.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Perfil")
public class PerfilResource {
    public final PerfilService perfilService;
@Autowired
    public PerfilResource(PerfilService perfilService) {
        this.perfilService = perfilService;
    }

    @GetMapping("/todos")
    public ResponseEntity<List<Perfil>> getAllPerfil() {
        List<Perfil> perfiles = perfilService.findAllPerfil();
        return new ResponseEntity<>(perfiles, HttpStatus.OK);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Perfil> getPerfilByID(@PathVariable("id") Long id) {
        Perfil perfil = perfilService.findPerfilById(id);
        return new ResponseEntity<>(perfil, HttpStatus.OK);
    }

    @PostMapping("/agregar")
    public ResponseEntity<Perfil> addPerfil(@RequestBody Perfil perfil) {
        Perfil newusuario = perfilService.addPerfil(perfil);
        return new ResponseEntity<>(newusuario, HttpStatus.CREATED);
    }

    @PutMapping("/editar")
    public ResponseEntity<Perfil> updatePerfil(@RequestBody Perfil perfil) {
        Perfil updatePerfil = perfilService.updatePerfil(perfil);
        return new ResponseEntity<>(updatePerfil, HttpStatus.OK);
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> deletePerfil(@PathVariable("id") Long id) {
        perfilService.deletePerfil(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}