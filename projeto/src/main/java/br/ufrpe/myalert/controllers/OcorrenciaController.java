package br.ufrpe.myalert.controllers;

import br.ufrpe.myalert.dao.OcorrenciaDAO;
import br.ufrpe.myalert.models.Ocorrencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/ocorrencias")
public class OcorrenciaController {
    @Autowired
    private OcorrenciaDAO ocorrenciaDAO;

    @GetMapping("/{cpf}")
    public ResponseEntity<?> findByCpf(@PathVariable("cpf") String cpf) {
        return new ResponseEntity<>(ocorrenciaDAO.findByCpf(cpf), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> saveByCpf(@RequestBody Ocorrencia ocorrencia) {
        return new ResponseEntity<>(ocorrenciaDAO.save(ocorrencia), HttpStatus.OK);
    }
}
