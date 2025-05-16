package com.manager.employees.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Countries")
public class Countries {
	
	@Id
	@Column(name = "country_id", nullable = false)
	private String countryId;

	@Column(name = "country_name", nullable = false)
	private String countryName;

//	@Column
//	private Integer REGION_ID;
	
    @ManyToOne
    @JoinColumn(name = "region_id")
    private Regions region;

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Regions getRegion() {
		return region;
	}

	public void setRegion(Regions region) {
		this.region = region;
	}

}
