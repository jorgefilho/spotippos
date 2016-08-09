package org.github.jorgefilho.spotippos.api.repository.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Boundary implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private Axis upperLeft;

	private Axis bottomRight;

	public Axis getUpperLeft() {
		return upperLeft;
	}

	public void setUpperLeft(Axis upperLeft) {
		this.upperLeft = upperLeft;
	}

	public Axis getBottomRight() {
		return bottomRight;
	}

	public void setBottomRight(Axis bottomRight) {
		this.bottomRight = bottomRight;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Boundary [id=" + id + ", upperLeft=" + upperLeft + ", bottomRight=" + bottomRight + "]";
	}
}