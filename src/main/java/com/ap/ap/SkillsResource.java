package com.ap.ap;
import com.ap.ap.model.Skills;
import com.ap.ap.service.SkillsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Skills")
public class SkillsResource {
    public final SkillsService skillsService;

    public SkillsResource(SkillsService skillsService) {
        this.skillsService = skillsService;
    }

    @GetMapping("/todos")
    public ResponseEntity<List<Skills>> getAllSkills() {
        List<Skills> skills = skillsService.findAllSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);}

    @PostMapping("/agregar")
    public ResponseEntity<Skills> addSkills(@RequestBody Skills skills) {
        Skills newskill = skillsService.addSkills(skills);
        return new ResponseEntity<>(newskill, HttpStatus.CREATED);
    }

    @PutMapping("/editar")
    public ResponseEntity<Skills> updateSkills(@RequestBody Skills skills) {
        Skills updateSkills = skillsService.updateSkills(skills);
        return new ResponseEntity<>(updateSkills, HttpStatus.OK);
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> deleteSkills(@PathVariable("id") Long id) {
        skillsService.deleteSkills(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

