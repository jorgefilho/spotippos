package org.github.jorgefilho.spotippos.api.utils;

import org.github.jorgefilho.spotippos.api.repository.domain.Axis;
import org.github.jorgefilho.spotippos.api.repository.domain.Property;

public class PropertyUtils {

	public static Property getNullProperty() {
		return null;
	}

	public static Property getValidProperty(final Long  id) {

		final Property property = new Property();
		property.setId(id);
		property.setBaths(1);
		property.setBeds(1);
		property.setSquareMeters(200);
		property.setAxis(new Axis(null, 50, 50));

		return property;
	}

	public static Property getPropertyWithNullAxis() {
		final Property property = new Property();

		property.setId(1L);
		property.setBaths(1);
		property.setBeds(1);
		property.setSquareMeters(200);
		property.setAxis(null);

		return property;
	}

}
