package com.org.employee.repository;

import com.org.employee.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
public interface EmployeeRepository extends MongoRepository<Employee,Integer> {
}
