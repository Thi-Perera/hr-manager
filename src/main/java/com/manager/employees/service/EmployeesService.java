package com.manager.employees.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manager.employees.model.Employees;
import com.manager.employees.repo.EmployeesRepository;

@Service
public class EmployeesService {

	@Autowired
	private EmployeesRepository empRepository;
	
	public List<Employees> getAllEmployeesProva(){
//		empRepository.getAllEmployeeByFilters();
		return (List<Employees>) empRepository.findAll();

	}
	
	public Optional<Employees> getEmployeeByIdProva(){
//		empRepository.getAllEmployeeByFilters();
		return empRepository.findById(10);

	}

}
