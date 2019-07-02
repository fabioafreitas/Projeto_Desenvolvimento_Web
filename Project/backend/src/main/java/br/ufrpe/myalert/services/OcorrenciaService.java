package br.ufrpe.myalert.services;

import br.ufrpe.myalert.dao.OcorrenciaDAO;
import br.ufrpe.myalert.models.Ocorrencia;
import br.ufrpe.myalert.modelsDTO.OcorrenciaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class OcorrenciaService {
    @Autowired
    private OcorrenciaDAO ocorrenciaDAO;

    public List<Ocorrencia> getAll() {
        return ocorrenciaDAO.findAll();
    }

    public List<Ocorrencia> getByCpf(String cpf) {
        return ocorrenciaDAO.findByCpf(cpf);
    }

    public Ocorrencia save(Ocorrencia ocorrencia) {
        return ocorrenciaDAO.save(ocorrencia);
    }

    public Ocorrencia update(Ocorrencia ocorrencia) {
        return ocorrenciaDAO.save(ocorrencia);
    }

    public void delete(Ocorrencia ocorrencia) {
        ocorrenciaDAO.delete(ocorrencia);
    }

    public String requisicaoApac(@RequestBody Ocorrencia ocorrencia) {
        String uriLocal = "http://localhost:9996/apac";
        String uriRemoto = "https://orgao-apac-api.herokuapp.com/apac";
        OcorrenciaDTO ocorrenciaDTO = modificarOcorrencia(ocorrencia);
        return requisicaoOcorrenciaOrgao(uriRemoto, ocorrenciaDTO);
    }

    public String requisicaoBombeiros(@RequestBody Ocorrencia ocorrencia) {
        String uriLocal = "http://localhost:9997/bombeiros";
        String uriRemoto = "https://orgao-bombeiros-api.herokuapp.com/bombeiros";
        OcorrenciaDTO ocorrenciaDTO = modificarOcorrencia(ocorrencia);
        return requisicaoOcorrenciaOrgao(uriRemoto, ocorrenciaDTO);
    }

    public String requisicaoCodecipe(@RequestBody Ocorrencia ocorrencia) {
        String uriLocal = "http://localhost:9998/codecipe";
        String uriRemoto = "https://orgao-codecipe-api.herokuapp.com/codecipe";
        OcorrenciaDTO ocorrenciaDTO = modificarOcorrencia(ocorrencia);
        return requisicaoOcorrenciaOrgao(uriRemoto, ocorrenciaDTO);
    }

    public String requisicaoSamu(@RequestBody Ocorrencia ocorrencia) {
        String uriLocal = "http://localhost:9999/samu";
        String uriRemoto = "https://orgao-samu-api.herokuapp.com/samu";
        OcorrenciaDTO ocorrenciaDTO = modificarOcorrencia(ocorrencia);
        return requisicaoOcorrenciaOrgao(uriRemoto, ocorrenciaDTO);
    }

    private String requisicaoOcorrenciaOrgao(String uri, OcorrenciaDTO ocorrenciaDTO) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<OcorrenciaDTO> entity = new HttpEntity<>(ocorrenciaDTO,headers);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.exchange(
                uri, HttpMethod.POST, entity, String.class).getBody();
    }

    private OcorrenciaDTO modificarOcorrencia(Ocorrencia ocorrencia) {
        return new OcorrenciaDTO(
                ocorrencia.getCpf(),
                ocorrencia.getTitulo(),
                ocorrencia.getDescricao(),
                ocorrencia.getDataCriacao(),
                ""+ocorrencia.getUrgencia()+"",
                ocorrencia.getCategoria());
    }
}
