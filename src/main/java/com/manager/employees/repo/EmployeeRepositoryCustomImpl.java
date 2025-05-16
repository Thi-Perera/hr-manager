package com.manager.employees.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.manager.employees.model.Employees;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class EmployeeRepositoryCustomImpl implements EmployeeRepositoryCustom {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Employees> getAllEmployeeByFilters() {
		return null;
	}

}
