package com.tushar.filteringandpaging.repository;

import com.tushar.filteringandpaging.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}
