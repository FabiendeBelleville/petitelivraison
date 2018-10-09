package model;

import javax.persistence.Embeddable;

@Embeddable
public class Engine {

	private String power;
	private String energy;

	public Engine() {
		super();
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getEnergy() {
		return energy;
	}

	public void setEnergy(String energy) {
		this.energy = energy;
	}

	@Override
	public String toString() {
		return "Engine [power=" + power + ", energy=" + energy + "]";
	}

}
