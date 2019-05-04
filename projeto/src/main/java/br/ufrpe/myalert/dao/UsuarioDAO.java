package br.ufrpe.myalert.dao;

import br.ufrpe.myalert.models.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioDAO extends MongoRepository<Usuario, String>{

}