package com.manager.employees.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.manager.employees.DTO.DepartmentDTO;
import com.manager.employees.model.Departments;

@Mapper(componentModel="spring")
public interface DepartmentsMapper {
	DepartmentDTO toDTO(Departments entity);
	List<DepartmentDTO> toListDTO(List<Departments> entity);
}
