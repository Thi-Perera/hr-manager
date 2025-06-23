package com.manager.employees.model;

import org.springframework.data.redis.core.RedisHash;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@RedisHash(value = "Departments") 
public class Departments {

	@Id
	@Column(name = "department_id", nullable = false)
	private Integer departmentId;

	@Column(name = "department_name", nullable = false)
	private String departmentName;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Locations location;

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
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
