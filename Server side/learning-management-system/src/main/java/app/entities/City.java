package app.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

@Entity
public class City {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String name;
	@ManyToOne(fetch = FetchType.LAZY)
	private Country country;
	@OneToMany(mappedBy="city")
	private Set<Address> address;
	
	@Version
	private int version = 0;
	
	
	public City() {
		
	}


	public City(String name, Country country, Set<Address> address) {
		this.name = name;
		this.country = country;
		this.address = address;
	}




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


	public Country getCountry() {
		return country;
	}


	public void setCountry(Country country) {
		this.country = country;
	}


	public Set<Address> getAddress() {
		return address;
	}


	public void setAddress(Set<Address> address) {
		this.address = address;
	}


	
	
	
	
}
