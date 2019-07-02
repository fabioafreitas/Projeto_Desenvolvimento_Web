package api.orgao.apac;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ApacDAO extends MongoRepository<Ocorrencia, String> {
}
