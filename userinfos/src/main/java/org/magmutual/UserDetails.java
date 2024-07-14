package org.magmutual;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="USERINFOS")
public class UserDetails {

	private @Id 
	@GeneratedValue Long id;
	private String firstname;
	private String lastname;
	private String email;
	private String profession;
	private String country;
	private String city;
	private String datecreated;

	public UserDetails() {
		
	}
	
	public UserDetails(String firstname, String lastname, String email, String profession, String country,
			String city, String dateCreated) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.profession = profession;
		this.country = country;
		this.city = city;
		this.datecreated = dateCreated;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Object orElseThrow(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(String dateCreated) {
		this.datecreated =  dateCreated;
	}
	
}
