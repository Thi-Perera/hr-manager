package com.manager.employees.repo;

import java.util.List;

import com.manager.employees.model.Employees;

public interface EmployeeRepositoryCustom {

	List<Employees> getAllEmployeeByFilters();

}
