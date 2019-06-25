package br.ufrpe.myalert.controllers;

import br.ufrpe.myalert.models.Ocorrencia;
import br.ufrpe.myalert.models.Usuario;
import br.ufrpe.myalert.services.OcorrenciaService;
import br.ufrpe.myalert.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
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


    //TODO alterar este método junto com o OrgaosController, quando for criado
    @PostMapping
    public ResponseEntity<?> requisicaoOrgao(@RequestBody Ocorrencia ocorrencia) {
        Usuario usuario = usuarioService.getByCpf(ocorrencia.getCpf());
        if(usuario == null) {
            return new ResponseEntity<>("Usuario não está cadastrado", HttpStatus.NOT_FOUND);
        }
        if(ocorrencia.getCategoria() < 0 || ocorrencia.getCategoria() > 4) {
            return new ResponseEntity<>("Orgão não está cadastrado", HttpStatus.NOT_FOUND);
        }
        Ocorrencia o = ocorrenciaService.save(ocorrencia);
        String resposta = "";
        switch(ocorrencia.getCategoria()) {
            case 1:
                resposta = ocorrenciaService.requisicaoApac(ocorrencia);
                break;
            case 2:
                resposta = ocorrenciaService.requisicaoBombeiros(ocorrencia);
                break;
            case 3:
                resposta = ocorrenciaService.requisicaoCodecipe(ocorrencia);
                break;
            case 4:
                resposta = ocorrenciaService.requisicaoSamu(ocorrencia);
                break;
            default:
        }
        return new ResponseEntity<>(resposta, HttpStatus.OK);
    }

}
