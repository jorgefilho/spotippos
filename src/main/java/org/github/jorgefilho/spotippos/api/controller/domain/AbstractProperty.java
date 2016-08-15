package org.github.jorgefilho.spotippos.api.controller.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public abstract class AbstractProperty {

	@Min(0)
	@Max(1400)
	private int x;

	@Min(0)
	@Max(1000)
	private int y;

	@NotBlank
	@Size(min = 1, max = 50)
	private String title;

	@Min(1)
	private Long price;

	@NotBlank
	@Size(min = 1, max = 100)
	private String description;

	@Min(1)
	@Max(5)
	private int beds;

	@Min(1)
	@Max(4)
	private int baths;

	@Min(20)
	@Max(240)
	private int squareMeters;

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
		return "AbstractPropertyRequest [x=" + x + ", y=" + y + ", title=" + title + ", price=" + price
				+ ", description=" + description + ", beds=" + beds + ", baths=" + baths + ", squareMeters="
				+ squareMeters + "]";
	}
}
