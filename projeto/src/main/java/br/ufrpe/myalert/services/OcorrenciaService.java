package br.ufrpe.myalert.services;

import br.ufrpe.myalert.dao.OcorrenciaDAO;
import br.ufrpe.myalert.models.Ocorrencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
