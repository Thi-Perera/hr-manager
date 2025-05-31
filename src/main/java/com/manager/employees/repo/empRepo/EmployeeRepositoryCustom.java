package com.manager.employees.repo.empRepo;

import java.util.List;

import com.manager.employees.DTO.UserFilterDTO;
import com.manager.employees.model.Employees;

public interface EmployeeRepositoryCustom {

	List<Employees> getAllEmployeeByFilters(UserFilterDTO filters);

	Employees getEmployeeByIdCustom(Integer id);
	
}
