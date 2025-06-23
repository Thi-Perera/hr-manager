package com.manager.employees.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.manager.employees.DTO.CountryDTO;
import com.manager.employees.DTO.DepartmentDTO;
import com.manager.employees.DTO.EmployeeDTO;
import com.manager.employees.DTO.JobDTO;
import com.manager.employees.DTO.LocationDTO;
import com.manager.employees.DTO.RegionDTO;
import com.manager.employees.DTO.UserFilterDTO;
import com.manager.employees.service.EmployeesService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
    @Autowired
    private EmployeesService empService;
	
	@PostMapping("/employees")
	public List<EmployeeDTO> getEmpsByFilters(@RequestBody UserFilterDTO userDataDTO) {
		
		return empService.getAllEmployeesByFilters(userDataDTO);
	}
	
	@GetMapping("/employee/{id}")
	public EmployeeDTO getEmpById(@PathVariable Integer id) {
		return empService.getEmpById(id);
	}
	
	@PutMapping("/employee")
	public EmployeeDTO updateUser(@RequestBody EmployeeDTO empDetailed) {
		empService.updateEmp(empDetailed);
		return empService.getEmpById(empDetailed.getEmployeeId());
	}
	
	@PutMapping("/delete/employee/{id}")
	public void deleteEmployee(@PathVariable Integer id) {
		empService.deleteThisEmp(id);
	}	
	
	@GetMapping("/departments")
	public List<DepartmentDTO> getAllDeps() throws InterruptedException, JsonProcessingException {
		return empService.getAllDepartmentsNoCache();
	}
	
	@GetMapping("/jobs")
	public List<JobDTO> getAllJobs() {
		return empService.getAllJobs();
	}
	
	@GetMapping("/locations")
	public List<LocationDTO> getAllLocs() {
		return empService.getAllLocations();
	}
	
	@GetMapping("/countries")
	public List<CountryDTO> getAllCountries() {
		return empService.getAllCountries();
	}
	
	@GetMapping("/regions")
	public List<RegionDTO> getAllRegs() {
		return empService.getAllRegions();
	}	
	
	@GetMapping("/date")
	public Date getDate(){
		return Date.valueOf(LocalDate.now());
	}
}
