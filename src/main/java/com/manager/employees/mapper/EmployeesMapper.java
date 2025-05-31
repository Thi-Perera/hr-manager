package com.manager.employees.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.manager.employees.DTO.EmployeeDTO;
import com.manager.employees.model.Employees;

@Mapper(componentModel = "spring")
public interface EmployeesMapper {
	EmployeeDTO toDTO(Employees entity);
	List<EmployeeDTO> toListDTO(List<Employees> entityList);
}
