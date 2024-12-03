package com.sample.SpringDemo1.service;

import com.sample.SpringDemo1.dto.EmployeeDto;
import com.sample.SpringDemo1.entity.Employee;
import com.sample.SpringDemo1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addEmp(EmployeeDto employeeDto) {
        Employee employee=new Employee();
        employee.setEid(0L);
        employee.setEFirstname(employeeDto.getEFirstname());
        employee.setELastname(employeeDto.getELastname());
        employee.setEmail(employeeDto.getEmail());
        employee.setActive(true);
        employee.setCreatedBy(employeeDto.getCreatedBy());
        employee.setUpdatedBy(employeeDto.getUpdatedBy());
        employee.setUpdatedDate(LocalDateTime.now());
        return employeeRepository.save(employee);

    }
}
