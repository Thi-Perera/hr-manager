package com.manager.employees.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.manager.employees.DTO.JobDTO;
import com.manager.employees.model.Jobs;

@Mapper(componentModel = "spring")
public interface JobsMapper {

	JobDTO toDTO(Jobs entity);

	List<JobDTO> toListDTO(List<Jobs> entity);

}
