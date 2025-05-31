package com.manager.employees.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manager.employees.model.Jobs;

public interface JobsRepository extends JpaRepository<Jobs ,String>{

}
