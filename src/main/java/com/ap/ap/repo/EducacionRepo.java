package com.ap.ap.repo;
import com.ap.ap.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface EducacionRepo extends JpaRepository<Educacion, Long>{
    void deleteEducacionById(Long id);

    Optional<Educacion> findUsuarioById(Long id);
}
