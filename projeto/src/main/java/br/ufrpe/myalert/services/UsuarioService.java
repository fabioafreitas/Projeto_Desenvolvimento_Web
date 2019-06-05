package br.ufrpe.myalert.services;

import br.ufrpe.myalert.dao.UsuarioDAO;
import br.ufrpe.myalert.models.Endereco;
import br.ufrpe.myalert.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioDAO usuarioDAO;

    public Usuario getByCpf(String cpf) {
        return usuarioDAO.getByCpf(cpf);
    }

    public Usuario create(Usuario usuario) {
        Usuario usuarioAux = usuarioDAO.getByCpf(usuario.getCpf());
        if(usuarioAux != null) {
            return null;
        }
        return usuarioDAO.save(usuario);
    }

    public Usuario update(Usuario usuario) {
        Usuario usuarioAux = usuarioDAO.getByCpf(usuario.getCpf());
        if(usuarioAux == null) {
            return null;
        }
        usuarioAux.setFirst_name(usuario.getFirst_name());
        usuarioAux.setLast_name(usuario.getLast_name());
        usuarioAux.setGenero(usuario.getGenero());
        usuarioAux.setData_nascimento(usuario.getData_nascimento());
        usuarioAux.setEndereco(usuario.getEndereco());
        usuarioAux.setTelefone(usuario.getTelefone());
        return usuarioDAO.save(usuarioAux);
    }

    public boolean delete(Usuario usuario) {
        Usuario usuarioAux = usuarioDAO.getByCpf(usuario.getCpf());
        if(usuarioAux == null) {
            return false;
        }
        usuarioDAO.delete(usuarioAux);
        return true;
    }
}
