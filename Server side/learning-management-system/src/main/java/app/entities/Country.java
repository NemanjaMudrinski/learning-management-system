package app.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

@Entity
public class Country {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String name;
	@OneToMany(mappedBy="country", cascade=CascadeType.ALL)
	private Set<City> city;
	
	@Version
	public int version = 0;
	
	public Country() {
		
	}
	
	public Country(String name, Set<City> city) {
		this.name = name;
		this.city = city;
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


	public Set<City> getCity() {
		return city;
	}

	public void setCity(Set<City> city) {
		this.city = city;
	}
	
	
	
}
