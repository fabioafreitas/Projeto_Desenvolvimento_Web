package br.ufrpe.myalert.dao;

import br.ufrpe.myalert.models.Ocorrencia;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OcorrenciaDAO extends MongoRepository<Ocorrencia, String> {
    public List<Ocorrencia> findByCpf(String cpf);
}
