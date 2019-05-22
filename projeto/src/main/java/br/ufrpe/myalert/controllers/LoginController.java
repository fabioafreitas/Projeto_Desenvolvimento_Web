package br.ufrpe.myalert.controllers;


import br.ufrpe.myalert.dao.LoginDAO;
import br.ufrpe.myalert.error.CustomErrorType;
import br.ufrpe.myalert.models.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginDAO loginDAO;

    @PostMapping
    public ResponseEntity<?> loginConfirmation(@RequestBody Login login) {
        Login login2 = loginDAO.findByUsernameAndPassword(login.getUsername(), login.getPassword());
        if(login2 == null) {
            return new ResponseEntity<>(
                    new CustomErrorType("Erro ao logar"),
                    HttpStatus.NOT_FOUND
            );
        }
        return new ResponseEntity<>(
                true,
                HttpStatus.OK
        );
    }

    @PostMapping("/create")
    public ResponseEntity<?> criarLogin(@RequestBody Login login) {
        loginDAO.save(login);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }
}
