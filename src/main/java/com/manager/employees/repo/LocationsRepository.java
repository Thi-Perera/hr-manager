package com.manager.employees.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manager.employees.model.Locations;

public interface LocationsRepository extends JpaRepository<Locations, Integer> {
	
}
