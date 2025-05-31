package com.manager.employees.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manager.employees.model.Departments;

public interface DepartmentsRepository extends JpaRepository<Departments, Integer> {
	
}
