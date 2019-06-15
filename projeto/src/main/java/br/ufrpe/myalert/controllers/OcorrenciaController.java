package br.ufrpe.myalert.controllers;

import br.ufrpe.myalert.models.Ocorrencia;
import br.ufrpe.myalert.models.Usuario;
import br.ufrpe.myalert.services.OcorrenciaService;
import br.ufrpe.myalert.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/ocorrencias")
public class OcorrenciaController {

    @Autowired
    private OcorrenciaService ocorrenciaService;

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<?> getAll() {
        List<Ocorrencia> list = ocorrenciaService.getAll();
        if(list.isEmpty()) {
            return new ResponseEntity<>("Não há ocorrências cadastradas", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<?> getByCpf(@PathVariable("cpf") String cpf) {
        Usuario usuario = usuarioService.getByCpf(cpf);
        if(usuario == null) {
            return new ResponseEntity<>("Usuario não está cadastrado", HttpStatus.NOT_FOUND);
        }
        List<Ocorrencia> list = ocorrenciaService.getByCpf(cpf);
        if(list.isEmpty()) {
            return new ResponseEntity<>("Não há ocorrências cadastradas neste CPF", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Ocorrencia ocorrencia) {
        Usuario usuario = usuarioService.getByCpf(ocorrencia.getCpf());
        if(usuario == null) {
            return new ResponseEntity<>("Usuario não está cadastrado", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(ocorrenciaService.save(ocorrencia), HttpStatus.OK);
    }

    //TODO put e delete
}
