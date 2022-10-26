package com.ap.ap.controller;


import com.ap.ap.service.ProyectosService;
import com.ap.ap.model.Proyectos;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Proyecto")
public class ProyectosResource {
    public final ProyectosService proyectoService;

    public ProyectosResource(ProyectosService proyectoService) {
        this.proyectoService = proyectoService;
    }


    @GetMapping("/todos")
    public ResponseEntity<List<Proyectos>> getAllProyecto() {
        List<Proyectos> proyectos = proyectoService.findAllProyecto();
        return new ResponseEntity<>(proyectos, HttpStatus.OK);}

    @PostMapping("/agregar")
    public ResponseEntity<Proyectos> addProyecto(@RequestBody Proyectos proyectos) {
        Proyectos newproyecto = proyectoService.addProyecto(proyectos);
        return new ResponseEntity<>(newproyecto, HttpStatus.CREATED);
    }

    @PutMapping("/editar")
    public ResponseEntity<Proyectos> updateProyecto(@RequestBody Proyectos proyectos) {
        Proyectos updateProyectos = proyectoService.updateProyecto(proyectos);
        return new ResponseEntity<>(updateProyectos, HttpStatus.OK);
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> deleteProyecto(@PathVariable("id") Long id) {
        proyectoService.deleteProyecto(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }}