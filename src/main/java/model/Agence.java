package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agence {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long indicatif;
	private String name;

	public Agence() {
		super();
	}

	public Long getId() {
		return indicatif;
	}

	public void setId(Long id) {
		this.indicatif = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + indicatif + ", name=" + name + "]";
	}

}
