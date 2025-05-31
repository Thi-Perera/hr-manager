package com.manager.employees.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manager.employees.model.Countries;

public interface CountriesRepository extends JpaRepository<Countries, String> {
	
}
