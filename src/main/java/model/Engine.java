package model;

import javax.persistence.Embeddable;

@Embeddable
public class Engine {

	private String street;
	private String number;
	private String zipcode;
	private String town;

	public Engine() {
		super();
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", number=" + number + ", zipcode=" + zipcode + ", town=" + town + "]";
	}

}
