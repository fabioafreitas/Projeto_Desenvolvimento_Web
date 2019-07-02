package br.ufrpe.myalert.dao;

import br.ufrpe.myalert.models.Login;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoginDAO extends MongoRepository<Login, String> {
    Login findByUsername(String username);
}
