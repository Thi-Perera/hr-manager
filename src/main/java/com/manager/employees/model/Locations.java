package com.manager.employees.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Locations")
public class Locations {

	@Id
	@Column(name = "location_id", nullable = false)
	private Integer locationId;

	@Column(name = "street_address", nullable = false)
	private String streetAddress;

	@Column(name = "postal_code", nullable = false)
	private String postalCode;

	@Column(name = "city", nullable = false)
	private String city;

	@Column(name = "state_province", nullable = false)
	private String stateProvince;

	@ManyToOne
	@JoinColumn(name = "country_id")
	private Countries country;

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Countries getCountry() {
		return country;
	}

	public void setCountry(Countries country) {
		this.country = country;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

}
