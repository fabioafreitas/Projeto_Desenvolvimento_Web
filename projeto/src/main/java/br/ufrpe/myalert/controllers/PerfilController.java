package br.ufrpe.myalert.controllers;

import br.ufrpe.myalert.models.Usuario;
import br.ufrpe.myalert.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/profile")
public class PerfilController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<?> getByUsername(@RequestParam("email") String email) {
        Usuario usuario = usuarioService.getByUsername(email);
        if(usuario == null) {
            return new ResponseEntity<>("Usuario não encontrado!", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }
}
