package api.orgao.samu;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SamuDAO extends MongoRepository<Ocorrencia, String> {
}
