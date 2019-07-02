package api.orgao.codecipe;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CodecipeDAO extends MongoRepository<Ocorrencia, String> {
}
