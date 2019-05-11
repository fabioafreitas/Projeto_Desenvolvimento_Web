package br.ufrpe.myalert.controllers;

import br.ufrpe.myalert.dao.UsuarioDAO;
import br.ufrpe.myalert.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
class UsuarioController {

    @Autowired
    UsuarioDAO usuarioDAO;

    @RequestMapping("/create")
    public String create(Model model) {
        return "create";
    }

    @PostMapping("/usuario")
    public Usuario save(@RequestBody Usuario usuario) {
        Usuario _usuario = new Usuario();
        _usuario.setNome(usuario.getNome());
        usuarioDAO.save(_usuario);
        return _usuario;
    }

}
