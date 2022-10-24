package com.ap.ap.repo;

import com.ap.ap.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SkillsRepo extends JpaRepository<Skills, Long>
{
void deleteSkillsById(Long id);

Optional<Skills> findSkillsById(Long id);
}
