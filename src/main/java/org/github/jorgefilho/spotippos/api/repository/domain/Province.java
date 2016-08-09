package org.github.jorgefilho.spotippos.api.repository.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Province implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private String name;

	private Boundary boundaries;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boundary getBoundaries() {
		return boundaries;
	}

	public void setBoundaries(Boundary boundaries) {
		this.boundaries = boundaries;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Province [id=" + id + ", name=" + name + ", boundaries=" + boundaries + "]";
	}
}
