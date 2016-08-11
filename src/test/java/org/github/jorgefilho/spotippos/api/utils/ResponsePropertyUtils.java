package org.github.jorgefilho.spotippos.api.utils;

import org.github.jorgefilho.spotippos.api.controller.domain.ResponseProperty;

public class ResponsePropertyUtils {

	public static ResponseProperty getValidResponseProperty() {
		ResponseProperty responseProperty = new ResponseProperty();

		responseProperty.setId(1L);
		responseProperty.setX(100);
		responseProperty.setY(650);
		responseProperty.setTitle("Title");
		responseProperty.setDescription("Description");
		responseProperty.setPrice(100);
		responseProperty.setBaths(1);
		responseProperty.setBeds(1);
		responseProperty.setSquareMeters(200);

		return responseProperty;
	}

}
