package com.ap.ap.repo;
import com.ap.ap.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepo extends JpaRepository <Usuario, Long> {
    void deleteUsuarioById(Long id);

    Optional<Usuario> findUsuarioById(Long id);

}

