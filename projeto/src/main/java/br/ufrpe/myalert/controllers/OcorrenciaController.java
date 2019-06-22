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

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Ocorrencia ocorrencia) {
        Usuario usuario = usuarioService.getByCpf(ocorrencia.getCpf());
        if(usuario == null) {
            return new ResponseEntity<>("Usuario não está cadastrado", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(ocorrenciaService.save(ocorrencia), HttpStatus.OK);
    }

    
    
    //COMUNICAÇÃO COM OS ORGÃOS FANTASIA

    @PostMapping("/apac")
    public String requisicaoApac(@RequestBody Ocorrencia ocorrencia) {
        //String uriLocal = "http://localhost:9996/apac";
        String uriRemoto = "https://orgao-apac-api.herokuapp.com/apac";
        return requisicaoOcorrenciaOrgao(uriRemoto, ocorrencia);
    }

    @PostMapping("/bombeiros")
    public String requisicaoBombeiros(@RequestBody Ocorrencia ocorrencia) {
        //String uriLocal = "http://localhost:9997/bombeiros";
        String uriRemoto = "https://orgao-bombeiros-api.herokuapp.com/bombeiros";
        return requisicaoOcorrenciaOrgao(uriRemoto, ocorrencia);
    }

    @PostMapping("/codecipe")
    public String requisicaoCodecipe(@RequestBody Ocorrencia ocorrencia) {
        //String uriLocal = "http://localhost:9998/codecipe";
        String uriRemoto = "https://orgao-codecipe-api.herokuapp.com/codecipe";
        return requisicaoOcorrenciaOrgao(uriRemoto, ocorrencia);
    }

    @PostMapping("/samu")
    public String requisicaoSamu(@RequestBody Ocorrencia ocorrencia) {
        //String uriLocal = "http://localhost:9999/samu";
        String uriRemoto = "https://orgao-samu-api.herokuapp.com/samu";
        return requisicaoOcorrenciaOrgao(uriRemoto, ocorrencia);
    }

    private String requisicaoOcorrenciaOrgao(String uri, Ocorrencia ocorrencia) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Ocorrencia> entity = new HttpEntity<>(ocorrencia,headers);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.exchange(
                uri, HttpMethod.POST, entity, String.class).getBody();
    }
}
