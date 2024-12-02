package com.sample.SpringDemo1.repository;

import com.sample.SpringDemo1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
