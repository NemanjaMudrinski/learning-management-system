package app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="addressId")
	private Long id;
	@NotNull
	private String street;
	@NotNull
	private String streetNumber;
	@ManyToOne(fetch = FetchType.LAZY)
	private City city;
	@Version
	private int version = 0;
	
	
	public Address() {
		
	}

	public Address(String street, String streetNumber, City city) {
		this.street = street;
		this.streetNumber = streetNumber;
		this.city = city;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
	
}
