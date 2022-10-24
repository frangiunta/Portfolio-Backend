package com.ap.ap;


import com.ap.ap.model.Educacion;
import com.ap.ap.service.EducacionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Educacion")
public class EducacionResource {
    public final EducacionService educacionService;

    public EducacionResource(EducacionService educacionService) {
        this.educacionService = educacionService;
    }
    @GetMapping("/todos")
    public ResponseEntity<List<Educacion>> getAllEducacion() {
        List<Educacion> educacions = educacionService.findAllEducacions();
        return new ResponseEntity<>(educacions, HttpStatus.OK);
    }

    @PostMapping("/agregar")
    public ResponseEntity<Educacion> addEducacion(@RequestBody Educacion educacion) {
    Educacion neweducacion = educacionService.addEducacion(educacion);
    return new ResponseEntity<>(neweducacion, HttpStatus.CREATED);}

    @PutMapping("/editar")
    public ResponseEntity<Educacion> updateEducacion(@RequestBody Educacion educacion){
        Educacion updateEducacion = educacionService.updateEducacion(educacion);
        return new ResponseEntity<>(updateEducacion, HttpStatus.OK);
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> deleteEducacion(@PathVariable("id") Long id){
        educacionService.deleteEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
