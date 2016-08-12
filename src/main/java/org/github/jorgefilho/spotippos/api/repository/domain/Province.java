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
@Table(name = Province.TABLE_NAME)
public class Province implements Serializable {

	private static final long serialVersionUID = 1L;

	protected static final String TABLE_NAME = "province";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;

	@Column(length = 150, nullable = false)
	private String name;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "boundaries_id")
	private Boundary boundaries;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "Province [id=" + id + ", name=" + name + ", boundaries=" + boundaries + "]";
	}
}
