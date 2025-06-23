package com.manager.employees.service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.manager.employees.DTO.CountryDTO;
import com.manager.employees.DTO.DepartmentDTO;
import com.manager.employees.DTO.EmployeeDTO;
import com.manager.employees.DTO.JobDTO;
import com.manager.employees.DTO.LocationDTO;
import com.manager.employees.DTO.RegionDTO;
import com.manager.employees.DTO.UserFilterDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.manager.employees.mapper.CountryMapper;
import com.manager.employees.mapper.DepartmentsMapper;
import com.manager.employees.mapper.EmployeesMapper;
import com.manager.employees.mapper.JobsMapper;
import com.manager.employees.mapper.LocationsMapper;
import com.manager.employees.mapper.RegionsMapper;
import com.manager.employees.model.CacheData;
import com.manager.employees.model.Employees;
import com.manager.employees.repo.CountriesRepository;
import com.manager.employees.repo.DepartmentsRepository;
import com.manager.employees.repo.JobsRepository;
import com.manager.employees.repo.LocationsRepository;
import com.manager.employees.repo.RegionsRepository;
import com.manager.employees.repo.empRepo.EmployeesRepository;
import com.manager.employees.repo.redis.CacheDataRepository;

@Service
public class EmployeesService {

	@Autowired
	private EmployeesRepository empRepository;

	@Autowired
	private DepartmentsRepository depRepository;

	@Autowired
	private LocationsRepository locRepository;

	@Autowired
	private RegionsRepository regRepository;

	@Autowired
	private CountriesRepository ctryRepository;

	@Autowired
	private JobsRepository jobRepository;
	
	@Autowired
	private CacheDataRepository cacheDataRepository;

	@Autowired
	private EmployeesMapper employeesMapper;

	@Autowired
	private DepartmentsMapper departmentsMapper;

	@Autowired
	private LocationsMapper locationsMapper;

	@Autowired
	private RegionsMapper regionsMapper;

	@Autowired
	private CountryMapper countryMapper;

	@Autowired
	private JobsMapper jobMapper;
	
	private final ObjectMapper objectMapper = new ObjectMapper(); // invece di new ObjectMapper()



	
	public List<EmployeeDTO> getAllEmployeesByFilters(UserFilterDTO userFilters) {
		return employeesMapper.toListDTO(empRepository.getAllEmployeeByFilters(userFilters));
	}

	public EmployeeDTO getEmpById(Integer id) {
		return empRepository.findById(id).filter(emp -> emp.getExpireDate() == null).map(emp -> {
			EmployeeDTO dto = employeesMapper.toDTO(emp);
			dto.setDepDTO(departmentsMapper.toDTO(emp.getDepartment()));
			dto.setJobDTO(jobMapper.toDTO(emp.getJob()));
			return dto;
		}).orElse(null);
	}

	public List<DepartmentDTO> getAllDepartments() throws JsonProcessingException, InterruptedException {
	    Optional<CacheData> optionalCacheData = cacheDataRepository.findById("allDepartments");

	    if (optionalCacheData.isPresent()) {
	        String cachedJson = optionalCacheData.get().getValue();
	        TypeReference<List<DepartmentDTO>> mapType = new TypeReference<List<DepartmentDTO>>() {};
	        return objectMapper.readValue(cachedJson, mapType);
	    }

	    // Cache miss: recupero dal DB e salvo in cache
	    //Thread.sleep(5000);
	    List<DepartmentDTO> departmentDTOList = departmentsMapper.toListDTO(depRepository.findAll());
	    String jsonToCache = objectMapper.writeValueAsString(departmentDTOList);
	    cacheDataRepository.save(new CacheData("allDepartments", jsonToCache));
	    return departmentDTOList;
	}

	
	public List<DepartmentDTO> getAllDepartmentsNoCache() {
		return departmentsMapper.toListDTO(depRepository.findAll());
	}
	
	public List<LocationDTO> getAllLocations() {
		return locationsMapper.toListDTO(locRepository.findAll());
	}


	public List<CountryDTO> getAllCountries() {
		return countryMapper.toDtoList(ctryRepository.findAll());
	}
	

	public List<RegionDTO> getAllRegions() {
		return regionsMapper.toListDTO(regRepository.findAll());
	}

	public void updateEmp(EmployeeDTO empToUpdate) {
		Employees myEmp = empRepository.findById(empToUpdate.getEmployeeId()).get();
		myEmp.setFirstName(empToUpdate.getFirstName());
		myEmp.setLastName(empToUpdate.getLastName());
		myEmp.setSalary(empToUpdate.getSalary());
		myEmp.setEmail(empToUpdate.getEmail());
		myEmp.setJob(jobRepository.findById(empToUpdate.getJobDTO().getJobId()).get());
		myEmp.setDepartment(depRepository.findById(empToUpdate.getDepDTO().getDepartmentId()).get());
		empRepository.save(myEmp);
	}

	public void deleteThisEmp(Integer id) {
		Employees myEmp = empRepository.findById(id).get();
		if (myEmp.getExpireDate() == null) {
			myEmp.setExpireDate(Date.valueOf(LocalDate.now()));
			empRepository.save(myEmp);
		}
	}


	public List<JobDTO> getAllJobs() {
		return jobMapper.toListDTO(jobRepository.findAll());
	}

}
