package org.github.jorgefilho.spotippos.api.service.parser.impl;

import java.util.ArrayList;
import java.util.List;

import org.github.jorgefilho.spotippos.api.repository.domain.Property;
import org.github.jorgefilho.spotippos.api.service.domain.InputProperty;
import org.github.jorgefilho.spotippos.api.service.parser.PropertyParser;
import org.springframework.util.CollectionUtils;

public class PropertyParserImpl implements PropertyParser {

	@Override
	public List<Property> parse(final List<InputProperty> inputProperties) {
		final List<Property> properties = new ArrayList<>();
		if (!CollectionUtils.isEmpty(inputProperties)) {
			inputProperties.stream().forEach(p -> {
				properties.add(this.parse(p));

			});
		}
		return properties;
	}

	@Override
	public Property parse(final InputProperty inputProperty) {
		final Property property = new Property();

		return property;
	}

}