package com.ap.ap;

import com.ap.ap.model.Usuario;
import com.ap.ap.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Usuario")
public class UsuarioResource {
    public final UsuarioService usuarioService;

    public UsuarioResource(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/todos")
    public ResponseEntity<List<Usuario>> getAllUsuarios() {
        List<Usuario> usuarios = usuarioService.findAllUsuarios();
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable("id") Long id) {
        Usuario usuario = usuarioService.findUsuarioById(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    @PostMapping("/agregar")
    public ResponseEntity<Usuario> addUsuario(@RequestBody Usuario usuario) {
        Usuario newusuario = usuarioService.addUsuario(usuario);
        return new ResponseEntity<>(newusuario, HttpStatus.CREATED);
    }

    @PutMapping("/editar")
    public ResponseEntity<Usuario> updateUsuario(@RequestBody Usuario usuario) {
        Usuario updateUsuario = usuarioService.updateUsuario(usuario);
        return new ResponseEntity<>(updateUsuario, HttpStatus.OK);
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> deleteUsuario(@PathVariable("id") Long id) {
        usuarioService.deleteUsuario(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}