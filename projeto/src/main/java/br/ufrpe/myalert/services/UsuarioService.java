package br.ufrpe.myalert.services;

import br.ufrpe.myalert.dao.UsuarioDAO;
import br.ufrpe.myalert.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioDAO usuarioDAO;

    public List<Usuario> getAll() {
        return usuarioDAO.findAll();
    }

    public Usuario getByCpf(String cpf) {
        return usuarioDAO.getByCpf(cpf);
    }

    public Usuario getByUsername(String username) {
        return usuarioDAO.findByUsername(username);
    }

    public Usuario save(Usuario usuario) {
        return usuarioDAO.save(usuario);
    }

    public Usuario update(Usuario usuario) {
        return usuarioDAO.save(usuario);
    }

    public void delete(Usuario usuario) {
        usuarioDAO.delete(usuario);
    }
}
