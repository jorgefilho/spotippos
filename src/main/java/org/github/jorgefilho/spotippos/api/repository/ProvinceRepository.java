package org.github.jorgefilho.spotippos.api.repository;

import org.github.jorgefilho.spotippos.api.repository.domain.Province;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProvinceRepository extends MongoRepository<Province, String> {

}
