package api.orgao.bombeiros;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BombeirosDAO extends MongoRepository<Ocorrencia, String> {
}
