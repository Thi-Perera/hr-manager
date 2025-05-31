package com.manager.employees.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.manager.employees.DTO.RegionDTO;
import com.manager.employees.model.Regions;

@Mapper(componentModel="spring")
public interface RegionsMapper {
	RegionDTO toDTO(Regions entity);
	List<RegionDTO> toListDTO(List<Regions> entity);
}