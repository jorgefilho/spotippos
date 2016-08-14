package org.github.jorgefilho.spotippos.api.repository.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = Boundary.TABLE_NAME)
public class Boundary implements Serializable {

	private static final long serialVersionUID = 1L;

	protected static final String TABLE_NAME = "boundaries";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "upper_left_id")
	private Axis upperLeft;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "bottom_right_id")
	private Axis bottomRight;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "Boundary [id=" + id + ", upperLeft=" + upperLeft + ", bottomRight=" + bottomRight + "]";
	}

}