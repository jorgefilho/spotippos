package org.github.jorgefilho.spotippos.api.repository.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = Property.TABLE_NAME)
public class Property implements Serializable {

	private static final long serialVersionUID = 1L;

	protected static final String TABLE_NAME = "property";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;

	private String title;

	private String description;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "axis_id")
	private Axis axis;

	@Column(nullable = false)
	private Integer beds;

	@Column(nullable = false)
	private Integer baths;

	@Column(nullable = false)
	private Integer squareMeters;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "Property [id=" + id + ", axis=" + axis + ", beds=" + beds + ", baths=" + baths + ", squareMeters="
				+ squareMeters + "]";
	}
}