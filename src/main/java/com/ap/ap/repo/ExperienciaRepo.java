package com.ap.ap.repo;

import com.ap.ap.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ExperienciaRepo extends JpaRepository<Experiencia, Long>{
    void deleteExperienciaById(Long id);

    Optional<Experiencia> findExperienciaById(Long id);

}
