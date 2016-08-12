package org.github.jorgefilho.spotippos.api.repository;

import org.github.jorgefilho.spotippos.api.repository.domain.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {

}
