package org.github.jorgefilho.spotippos.api.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.github.jorgefilho.spotippos.api.repository.PropertyRepository;
import org.github.jorgefilho.spotippos.api.repository.ProvinceRepository;
import org.github.jorgefilho.spotippos.api.repository.domain.Property;
import org.github.jorgefilho.spotippos.api.service.InputDataService;
import org.github.jorgefilho.spotippos.api.service.domain.InputProperties;
import org.github.jorgefilho.spotippos.api.service.parser.PropertyParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class InputDataServiceImpl implements InputDataService {

	private static final ObjectMapper MAPPER = new ObjectMapper();

	@Autowired
	private ProvinceRepository provinceRepository;

	@Autowired
	private PropertyRepository propertyRepository;

	@Autowired
	private PropertyParser propertyParser;

	@Override
	public void load() {

		this.loadProperties();

	}

	private void loadProperties() {
		try {
			ClassLoader loader = Thread.currentThread().getContextClassLoader();
			InputStream is = loader.getResourceAsStream("input-data/properties.json");

			final InputProperties inputProperties = MAPPER.readValue(is, new TypeReference<InputProperties>() {
			});

			final List<Property> properties = propertyParser.parse(inputProperties.getProperties());

			this.propertyRepository.save(properties);
		} catch (IOException e) {
			throw new RuntimeException("Could not load properties from json file.");
		}
	}

}
