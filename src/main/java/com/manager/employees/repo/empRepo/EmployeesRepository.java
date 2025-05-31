package com.manager.employees.repo.empRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manager.employees.DTO.EmployeeDTO;
import com.manager.employees.model.Employees;

public interface EmployeesRepository extends JpaRepository<Employees, Integer>, EmployeeRepositoryCustom {

}
