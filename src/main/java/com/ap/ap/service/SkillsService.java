package com.ap.ap.service;

import com.ap.ap.model.Skills;
import com.ap.ap.repo.SkillsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class SkillsService {
    private final SkillsRepo skillsRepo;
@Autowired
    public SkillsService(SkillsRepo skillsRepo) {
        this.skillsRepo = skillsRepo;
    }
    public Skills addSkills(Skills skills){
      skills.setSkillCode(UUID.randomUUID().toString());
        return skillsRepo.save(skills);
    }
    public List<Skills> findAllSkills()
    {return skillsRepo.findAll();}

    public Skills updateSkills(Skills skills)
    {return skillsRepo.save(skills);}

    public void deleteSkills(Long id)
    {skillsRepo.deleteSkillsById(id);
    }
}
