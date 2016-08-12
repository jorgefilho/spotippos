package org.github.jorgefilho.spotippos.api.service.impl;

import org.github.jorgefilho.spotippos.api.controller.domain.RequestProperty;
import org.github.jorgefilho.spotippos.api.controller.domain.ResponseProperty;
import org.github.jorgefilho.spotippos.api.repository.PropertyRepository;
import org.github.jorgefilho.spotippos.api.repository.domain.Property;
import org.github.jorgefilho.spotippos.api.service.PropertyService;
import org.github.jorgefilho.spotippos.api.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImpl implements PropertyService {

	@Autowired
	private PropertyRepository propertyRepository;

	@Override
	public ResponseProperty save(final RequestProperty requestProperty) {
		final Property property = this.propertyRepository.save(Utils.copyProperties(requestProperty));
		final ResponseProperty responseProperty = Utils.copyProperties(property).get();
		return responseProperty;
	}
}
