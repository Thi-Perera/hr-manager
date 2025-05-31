package com.manager.employees.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Jobs")
public class Jobs {

	@Id
	@Column(name="job_id", nullable = false)
	private String jobId;
	
	@Column(name="job_title", nullable = false)
	private String jobTitle;
	
	@Column(name="max_salary", nullable = false)
	private Integer maxSalary;
	
	@Column(name="min_salary", nullable = false)
	private Integer minSalary;

	@ManyToOne
	@JoinColumn(name="department_id")
	private Departments department;
	
	public String getJobId() {
		return jobId;
	}
	
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Integer getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(Integer maxSalary) {
		this.maxSalary = maxSalary;
	}

	public Integer getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(Integer minSalary) {
		this.minSalary = minSalary;
	}

	public Departments getDepartment() {
		return department;
	}

	public void setDepartment(Departments department) {
		this.department = department;
	}
}
