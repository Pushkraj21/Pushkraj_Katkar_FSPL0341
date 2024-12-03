package com.sample.SpringDemo1.controller;

import com.sample.SpringDemo1.dto.EmployeeDto;
import com.sample.SpringDemo1.entity.Employee;
import com.sample.SpringDemo1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.HttpStatus.CREATED;

@Controller
@RequestMapping("/ems")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addData")
    public ResponseEntity <Employee>addEmp (@RequestBody EmployeeDto employeeDto){
        return new ResponseEntity<>(employeeService.addEmp(employeeDto),CREATED);
    }
}
