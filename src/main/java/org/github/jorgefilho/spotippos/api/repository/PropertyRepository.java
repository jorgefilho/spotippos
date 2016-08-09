package org.github.jorgefilho.spotippos.api.repository;

import org.github.jorgefilho.spotippos.api.repository.domain.Property;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PropertyRepository extends MongoRepository<Property, String> {

}
