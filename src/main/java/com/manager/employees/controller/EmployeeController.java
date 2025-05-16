package com.manager.employees.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manager.employees.model.Employees;
import com.manager.employees.service.EmployeesService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	
    @Autowired
    private EmployeesService empService;
	
	@GetMapping("/all")
	public List<Employees> getAllEmps() {
		return empService.getAllEmployeesProva();
	}
	
	@GetMapping("/prova")
	public Optional<Employees> getEmpByIdProva() {
		return empService.getEmployeeByIdProva();
	}
}
