package org.github.jorgefilho.spotippos.api.controller.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "x", "y", "title", "price", "description", "beds", "baths", "provinces", "squareMeters" })
public class ResponseProperty extends AbstractProperty {
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
