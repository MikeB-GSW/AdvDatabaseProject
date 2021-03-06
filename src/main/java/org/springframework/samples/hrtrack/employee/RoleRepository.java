package org.springframework.samples.hrtrack.employee;

import java.util.Collection;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

public interface RoleRepository extends CrudRepository<Employee, Integer> {

	/**
	 * Retrieve all <code>Employee</code>s from the data store.
	 * @return a <code>Collection</code> of <code>Employee</code>s
	 */
	@Cacheable("role")
	Collection<Employee> findAll() throws DataAccessException;

}
