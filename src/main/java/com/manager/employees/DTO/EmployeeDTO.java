package com.manager.employees.DTO;

public class EmployeeDTO {

	private Integer employeeId;
	private String firstName;
	private String lastName;
	private Integer salary;
	private String email;
	private DepartmentDTO depDTO;
	private JobDTO jobDTO;

	public EmployeeDTO() {
	};

	public EmployeeDTO(Integer employeeId, String firstName, String lastName, Integer salary, String email) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.email = email;
	}

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

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public DepartmentDTO getDepDTO() {
		return depDTO;
	}

	public void setDepDTO(DepartmentDTO depDTO) {
		this.depDTO = depDTO;
	}

	public JobDTO getJobDTO() {
		return jobDTO;
	}
	public void setJobDTO(JobDTO jobDTO) {
		this.jobDTO = jobDTO;
	}
	
}