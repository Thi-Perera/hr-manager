package com.manager.employees.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.manager.employees.DTO.LocationDTO;
import com.manager.employees.model.Locations;

@Mapper(componentModel="spring")
public interface LocationsMapper {
	LocationDTO toDTO(Locations entity);
	List<LocationDTO> toListDTO(List<Locations> entity);
}