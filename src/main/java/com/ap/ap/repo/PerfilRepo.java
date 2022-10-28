package com.ap.ap.repo;

import com.ap.ap.model.Perfil;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepo extends JpaRepository<Perfil, Long> {
    void deletePerfilById(Long id);

    Optional<Perfil> findPerfilById(Long id);
}



