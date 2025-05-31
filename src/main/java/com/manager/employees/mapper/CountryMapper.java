package com.manager.employees.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.manager.employees.DTO.CountryDTO;
import com.manager.employees.model.Countries;

@Mapper(componentModel = "spring")
public interface CountryMapper {
	CountryDTO toDTO(Countries entity);
	List<CountryDTO> toDtoList(List<Countries> entityList);
}
