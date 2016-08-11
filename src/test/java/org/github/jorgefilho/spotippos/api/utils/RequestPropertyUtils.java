package org.github.jorgefilho.spotippos.api.utils;

import org.github.jorgefilho.spotippos.api.controller.domain.RequestProperty;

public class RequestPropertyUtils {

	public static RequestProperty getValidRequestProperty() {
		RequestProperty requestProperty = new RequestProperty();

		requestProperty.setX(100);
		requestProperty.setY(650);
		requestProperty.setTitle("Title");
		requestProperty.setDescription("Description");
		requestProperty.setPrice(100);
		requestProperty.setBaths(1);
		requestProperty.setBeds(1);
		requestProperty.setSquareMeters(200);

		return requestProperty;
	}

}
