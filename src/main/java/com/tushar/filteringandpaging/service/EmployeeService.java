package com.tushar.filteringandpaging.service;

import com.tushar.filteringandpaging.model.Employee;
import com.tushar.filteringandpaging.model.EmployeePage;
import com.tushar.filteringandpaging.model.EmployeeSearchCriteria;
import com.tushar.filteringandpaging.repository.EmployeeCriteriaRepository;
import com.tushar.filteringandpaging.repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeCriteriaRepository employeeCriteriaRepository;

    public EmployeeService(EmployeeRepository employeeRepository, EmployeeCriteriaRepository employeeCriteriaRepository) {
        this.employeeRepository = employeeRepository;
        this.employeeCriteriaRepository = employeeCriteriaRepository;
    }

    public Page<Employee> getEmployees(EmployeePage employeePage,
                                       EmployeeSearchCriteria employeeSearchCriteria) {
        return employeeCriteriaRepository.findAllWithFilter(employeePage,employeeSearchCriteria);
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
