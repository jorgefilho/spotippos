package org.github.jorgefilho.spotippos.api.utils;

import java.util.Optional;

import org.github.jorgefilho.spotippos.api.controller.domain.RequestProperty;
import org.github.jorgefilho.spotippos.api.controller.domain.ResponseProperty;
import org.github.jorgefilho.spotippos.api.repository.domain.Axis;
import org.github.jorgefilho.spotippos.api.repository.domain.Property;
import org.springframework.beans.BeanUtils;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

public class Utils {
	public static Property copyProperties(final RequestProperty requestProperty) {
		Property property = null;
		if (!ObjectUtils.isEmpty(requestProperty)) {
			property = new Property();
			BeanUtils.copyProperties(requestProperty, property);
			Axis axis = new Axis();
			BeanUtils.copyProperties(requestProperty, axis);
			property.setAxis(axis);
		}
		return property;
	}

	public static Optional<ResponseProperty> copyProperties(final Property property) {
		ResponseProperty responseProperty = null;
		if (!ObjectUtils.isEmpty(property)) {
			Assert.notNull(property.getAxis(), "Axis must not be null");
			Assert.notNull(property.getId(), "The field 'id' must not be null");
			responseProperty = new ResponseProperty();
			BeanUtils.copyProperties(property, responseProperty);
			BeanUtils.copyProperties(property.getAxis(), responseProperty, "id");
		}
		return Optional.ofNullable(responseProperty);
	}
}
