package br.ufrpe.myalert.controllers;


import br.ufrpe.myalert.error.CustomErrorType;
import br.ufrpe.myalert.models.Login;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/login")
public class LoginController {

    /**
     * TODO adicionar criptografia no corpo da requisição post
     * TODO retornar um objeto usuário
     * @param login
     * @return
     */
    @PostMapping
    public ResponseEntity<?> loginConfirmation(@RequestBody Login login) {
        int index = Login.loginList.indexOf(login);
        if(index == -1) {
            return new ResponseEntity<>(
                    new CustomErrorType("Login não existe!"),
                    HttpStatus.NOT_FOUND
            );
        }
        return new ResponseEntity<>(
                true,
                HttpStatus.OK
        );
    }
}
