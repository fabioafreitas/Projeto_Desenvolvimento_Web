package br.ufrpe.myalert.dao;

import br.ufrpe.myalert.models.Endereco;
import br.ufrpe.myalert.models.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UsuarioDAO extends MongoRepository<Usuario, String>{
    public Usuario getByCpf(String cpf);
    public List<Usuario> getByEndereco(Endereco endereco);

    Usuario findByUsername(String username);
}