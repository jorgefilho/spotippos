package org.github.jorgefilho.spotippos.api.service.domain;

import java.io.Serializable;
import java.util.List;

public class InputProperties implements Serializable {

	private static final long serialVersionUID = 1L;

	private int totalProperties;

	private List<InputProperty> properties;

	public int getTotalProperties() {
		return totalProperties;
	}

	public void setTotalProperties(int totalProperties) {
		this.totalProperties = totalProperties;
	}

	public List<InputProperty> getProperties() {
		return properties;
	}

	public void setProperties(List<InputProperty> properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "InputProperty [totalProperties=" + totalProperties + ", properties=" + properties + "]";
	}
}
