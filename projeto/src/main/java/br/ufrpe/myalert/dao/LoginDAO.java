package br.ufrpe.myalert.dao;

import br.ufrpe.myalert.models.Login;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoginDAO extends MongoRepository<Login, String> {
    public Login findByUsernameAndPassword(String username, String password);
}
