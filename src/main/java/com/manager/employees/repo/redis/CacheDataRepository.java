package com.manager.employees.repo.redis;

import org.springframework.data.repository.CrudRepository;
import com.manager.employees.model.CacheData;

public interface CacheDataRepository extends CrudRepository<CacheData, String> {
    // nessun metodo custom necessario per ora
}
