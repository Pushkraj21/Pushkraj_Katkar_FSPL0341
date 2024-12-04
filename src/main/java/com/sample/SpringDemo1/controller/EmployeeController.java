package com.sample.SpringDemo1.controller;

import com.sample.SpringDemo1.dto.EmployeeDto;
import com.sample.SpringDemo1.entity.Employee;
import com.sample.SpringDemo1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static org.apache.tomcat.websocket.Constants.FOUND;
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

    @GetMapping("/getAll")
    public ResponseEntity<List<Employee>>getAllData(){
        return new ResponseEntity<>(employeeService.getAllData(), HttpStatus.FOUND);
    }
}
