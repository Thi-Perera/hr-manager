package com.manager.employees.repo.empRepo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.manager.employees.DTO.EmployeeDTO;
import com.manager.employees.DTO.UserFilterDTO;
import com.manager.employees.model.Employees;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class EmployeeRepositoryCustomImpl implements EmployeeRepositoryCustom {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Employees> getAllEmployeeByFilters(UserFilterDTO filters) {

		StringBuilder str1 = new StringBuilder();
		str1.append(
				"SELECT new com.manager.employees.model.Employees(e.employeeId, e.firstName, e.lastName, e.email, e.phoneNumber, e.salary) FROM Employees e WHERE 1=1 and e.expireDate is null ");
		Map<String, Object> params = new HashMap<>();
		if (!filters.getFirstName().isEmpty()) {
			str1.append(" and e.firstName LIKE :firstName ");
			params.put("firstName", filters.getFirstName());
		}
		if (!(filters.getSalaryMin() == null && filters.getSalaryMax() == null)) {
			str1.append(" and (e.salary BETWEEN :min AND :max)");
			params.put("max", filters.getSalaryMax() == null ? 999999999 : filters.getSalaryMax());
			params.put("min", filters.getSalaryMin() == null ? 0 : filters.getSalaryMin());
		}
		if (!filters.getDepartmentName().isEmpty()) {
			str1.append(" and e.department.departmentName = :departmentName");
			params.put("departmentName", filters.getDepartmentName());
		}
		if (!filters.getStreetAddress().isEmpty()) {
			str1.append(" and e.department.location.streetAddress = :streetAddress");
			params.put("streetAddress", filters.getStreetAddress());
		}
		if (!filters.getCountryName().isEmpty()) {
			str1.append(" and e.department.location.country.countryName = :countryName");
			params.put("countryName", filters.getCountryName());
		}
		if (!filters.getRegionName().isEmpty()) {
			str1.append(" and e.department.location.country.region.regionName = :regionName");
			params.put("regionName", filters.getRegionName());
		}
		TypedQuery<Employees> query = em.createQuery(str1.toString(), Employees.class);
		params.keySet().forEach(key -> query.setParameter(key, params.get(key)));

		return query.getResultList();
	}

	@Override
	public Employees getEmployeeByIdCustom(Integer id) {
		final String str = ("SELECT new com.manager.employees.model.Employees(e.employeeId, e.firstName, e.lastName, e.email, e.phoneNumber, e.salary) FROM Employees e WHERE e.employeeId=:id and e.expireDate is null");
		return (Employees) em.createQuery(str.toString()).setParameter("id", id).getSingleResult();
	}

}
