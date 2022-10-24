package com.ap.ap.repo;

import com.ap.ap.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProyectosRepo extends JpaRepository<Proyectos,Long> {
    void deleteProyectoById(Long id);

    Optional<Proyectos> findProyectoById(Long id);

}
