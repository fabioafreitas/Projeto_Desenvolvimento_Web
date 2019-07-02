package br.ufrpe.myalert.services;

import br.ufrpe.myalert.dao.LoginDAO;
import br.ufrpe.myalert.models.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    private LoginDAO loginDAO;

    public List<Login> getAll() {
        return loginDAO.findAll();
    }

    public Login getByUsername(String username) {
        return loginDAO.findByUsername(username);
    }

    public Login save(Login login) {
        return loginDAO.save(login);
    }

    public Login update(Login login) {
        return loginDAO.save(login);
    }

    public void delete(Login login) {
        loginDAO.delete(login);
    }
}
