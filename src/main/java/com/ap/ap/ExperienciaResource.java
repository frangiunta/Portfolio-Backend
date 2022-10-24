package com.ap.ap;
import com.ap.ap.model.Experiencia;
import com.ap.ap.service.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Experiencia")
public class ExperienciaResource {
    public final ExperienciaService experienciaService;
@Autowired
    public ExperienciaResource(ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }

    @GetMapping("/todos")
    public ResponseEntity<List<Experiencia>> getAllExperiencia() {
        List<Experiencia> experiencias = experienciaService.findAllExperiencia();
        return new ResponseEntity<>(experiencias, HttpStatus.OK);}

    @PostMapping("/agregar")
    public ResponseEntity<Experiencia> addExperiencia(@RequestBody Experiencia experiencia) {
        Experiencia newexperiencia = experienciaService.addExperiencia(experiencia);
        return new ResponseEntity<>(newexperiencia, HttpStatus.CREATED);
    }

    @PutMapping("/editar")
    public ResponseEntity<Experiencia> updateExperiencia(@RequestBody Experiencia experiencia) {
        Experiencia updateExperiencia = experienciaService.updateExperiencia(experiencia);
        return new ResponseEntity<>(updateExperiencia, HttpStatus.OK);
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> deleteExperiencia(@PathVariable("id") Long id) {
        experienciaService.deleteExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

