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
        String uri = "http://localhost:9996/apac";
        return requisicaoOcorrenciaOrgao(uri, ocorrencia);
    }

    @PostMapping("/bombeiros")
    public String requisicaoBombeiros(@RequestBody Ocorrencia ocorrencia) {
        String uri = "http://localhost:9997/bombeiros";
        return requisicaoOcorrenciaOrgao(uri, ocorrencia);
    }

    @PostMapping("/codecipe")
    public String requisicaoCodecipe(@RequestBody Ocorrencia ocorrencia) {
        String uri = "http://localhost:9998/codecipe";
        return requisicaoOcorrenciaOrgao(uri, ocorrencia);
    }

    @PostMapping("/samu")
    public String requisicaoSamu(@RequestBody Ocorrencia ocorrencia) {
        String uri = "http://localhost:9999/samu";
        return requisicaoOcorrenciaOrgao(uri, ocorrencia);
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
