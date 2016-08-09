package org.github.jorgefilho.spotippos.api.repository.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Property implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private Axis axis;

	private Integer beds;

	private Integer baths;

	private Integer squareMeters;

	public Axis getAxis() {
		return axis;
	}

	public void setAxis(Axis axis) {
		this.axis = axis;
	}

	public Integer getBeds() {
		return beds;
	}

	public void setBeds(Integer beds) {
		this.beds = beds;
	}

	public Integer getBaths() {
		return baths;
	}

	public void setBaths(Integer baths) {
		this.baths = baths;
	}

	public Integer getSquareMeters() {
		return squareMeters;
	}

	public void setSquareMeters(Integer squareMeters) {
		this.squareMeters = squareMeters;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Property [id=" + id + ", axis=" + axis + ", beds=" + beds + ", baths=" + baths + ", squareMeters="
				+ squareMeters + "]";
	}
}
