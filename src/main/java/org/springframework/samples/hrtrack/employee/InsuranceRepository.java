package org.springframework.samples.hrtrack.employee;

import java.util.Collection;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

public interface InsuranceRepository extends CrudRepository<Employee, Integer> {

	@Cacheable("insurance")
	Collection<Employee> findAll() throws DataAccessException;

}
