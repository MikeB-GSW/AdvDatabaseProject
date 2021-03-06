package org.springframework.samples.hrtrack.employee;

import java.util.Collection;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	Collection<Employee> findAll() throws DataAccessException;

	Employee findById(int inId) throws DataAccessException;

	// @Query(value = "SELECT id.nextval FROM dual", nativeQuery = true)
	// int getNextSeriesId();

}
