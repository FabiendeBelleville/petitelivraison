package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String brand;
	private String model;
	// One Car To Many Engines
	@OneToMany(mappedBy = "car", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private Set<Engine> engines = new HashSet<>();

	public Car() {
		super();
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Set<Engine> getEngines() {
		return engines;
	}

	public void setEngines(Set<Engine> engines) {
		this.engines = engines;
	}

	public Long getId() {
		return id;
	}

	// methodes
		public void addEngine(Engine e) {
			engines.add(e);
			e.setCar(this);
		}

}
