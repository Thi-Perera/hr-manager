package com.manager.employees.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manager.employees.model.Regions;

public interface RegionsRepository extends JpaRepository<Regions, Integer> {
	
}
