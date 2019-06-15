package br.ufrpe.myalert.controllers;

import br.ufrpe.myalert.models.Login;
import br.ufrpe.myalert.models.Usuario;
import br.ufrpe.myalert.services.LoginService;
import br.ufrpe.myalert.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin("*")
@RestController
@RequestMapping("/usuarios")
class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private LoginService loginService;

    @GetMapping
    public ResponseEntity<?> getAll() {
        List<Usuario> list = usuarioService.getAll();
        if(list.isEmpty()) {
            return new ResponseEntity<>("Não há usuários cadastrados!", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<?> getByCpf(@PathVariable("cpf") String cpf) {
        Usuario usuario = usuarioService.getByCpf(cpf);
        if(usuario == null) {
            return new ResponseEntity<>("Usuario não existe", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Usuario usuario) {
        Usuario usuarioAux = usuarioService.getByCpf(usuario.getCpf());
        if(usuarioAux != null) {
            return new ResponseEntity<>("Usuário já cadastrado", HttpStatus.BAD_REQUEST);
        }
        Login loginAux = loginService.getByUsername(usuario.getUsername());
        if(loginAux != null) {
            return new ResponseEntity<>("Login já cadastrado", HttpStatus.BAD_REQUEST);
        }
        Login loginNovo = loginService.save(new Login(usuario.getUsername(), usuario.getPassword()));
        usuario.setPassword("");
        Usuario usuarioNovo = usuarioService.save(usuario);
        return new ResponseEntity<>(usuarioNovo, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Usuario usuario) {
        Usuario usuarioAux = usuarioService.getByCpf(usuario.getCpf());
        if(usuarioAux == null) {
            return new ResponseEntity<>("Usuário não está cadastrado", HttpStatus.NOT_FOUND);
        }
        usuario.setId(usuarioAux.getId());
        return new ResponseEntity<>(usuarioService.update(usuario), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> delete(@RequestBody Usuario usuario) {
        Usuario usuarioAux = usuarioService.getByCpf(usuario.getCpf());
        if(usuarioAux == null) {
            return new ResponseEntity<>("Usuario não está cadastrado", HttpStatus.NOT_FOUND);
        }
        usuarioService.delete(usuarioAux);
        return new ResponseEntity<>("Usuario deletado", HttpStatus.OK);
    }
}
