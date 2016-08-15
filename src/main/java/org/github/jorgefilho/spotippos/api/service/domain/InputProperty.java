package org.github.jorgefilho.spotippos.api.service.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InputProperty implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;

	private String title;

	private Long price;

	private String description;

	@JsonProperty("lat")
	private int x;

	@JsonProperty("long")
	private int y;

	private int beds;

	private int baths;

	private int squareMeters;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getBeds() {
		return beds;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}

	public int getBaths() {
		return baths;
	}

	public void setBaths(int baths) {
		this.baths = baths;
	}

	public int getSquareMeters() {
		return squareMeters;
	}

	public void setSquareMeters(int squareMeters) {
		this.squareMeters = squareMeters;
	}

	@Override
	public String toString() {
		return "InputProperty [id=" + id + ", title=" + title + ", price=" + price + ", description=" + description
				+ ", x=" + x + ", y=" + y + ", beds=" + beds + ", baths=" + baths + ", squareMeters=" + squareMeters
				+ "]";
	}
}
