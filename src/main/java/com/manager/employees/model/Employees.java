package com.manager.employees.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employees {
	
	    @Id
	    @Column(name = "employee_id")
	    private Integer employeeId;

	    @Column(name = "first_name", nullable = false)
	    private String firstName;

	    @Column(name = "last_name", nullable = false)
	    private String lastName;

	    @Column(name = "email", nullable = false)
	    private String email;

	    @Column(name = "phone_number", nullable = false)
	    private String phoneNumber;

	    @Column(name = "job_id", nullable = false)
	    private String jobId;

	    @Column(name = "salary", nullable = false)
	    private Double salary;

	    @Column(name = "commission_pct", nullable = false)
	    private Double commissionPct;

	    @Column(name = "manager_id", nullable = false)
	    private Integer managerId;

    
//    @Column
//    private Integer DEPARTMENT_ID;
    
	
    @ManyToOne
    @JoinColumn( name="department_id" )
    private Departments department;


	public Integer getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getJobId() {
		return jobId;
	}


	public void setJobId(String jobId) {
		this.jobId = jobId;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public Double getCommissionPct() {
		return commissionPct;
	}


	public void setCommissionPct(Double commissionPct) {
		this.commissionPct = commissionPct;
	}


	public Integer getManagerId() {
		return managerId;
	}


	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}


	public Departments getDepartment() {
		return department;
	}


	public void setDepartment(Departments department) {
		this.department = department;
	}


}
