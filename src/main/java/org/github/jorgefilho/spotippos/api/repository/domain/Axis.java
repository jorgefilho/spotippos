package org.github.jorgefilho.spotippos.api.repository.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Axis implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private Integer x;

	private Integer y;

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Axis [id=" + id + ", x=" + x + ", y=" + y + "]";
	}

}
