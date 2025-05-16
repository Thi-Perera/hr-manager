package com.manager.employees.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Departments {

	@Id
	@Column(name = "department_id", nullable = false)
	private String departmentId;

	@Column(name = "department_name", nullable = false)
	private String departmentName;

//	@Column
//	private Integer LOCATION_ID;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Locations location;

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Locations getLocation() {
		return location;
	}

	public void setLocation(Locations location) {
		this.location = location;
	}

}
