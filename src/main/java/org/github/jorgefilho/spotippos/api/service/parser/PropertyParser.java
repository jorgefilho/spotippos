package org.github.jorgefilho.spotippos.api.service.parser;

import java.util.List;

import org.github.jorgefilho.spotippos.api.repository.domain.Property;
import org.github.jorgefilho.spotippos.api.service.domain.InputProperty;

public interface PropertyParser {

	List<Property> parse(List<InputProperty> properties);

	Property parse(InputProperty property);

}
