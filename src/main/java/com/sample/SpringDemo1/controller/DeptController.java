package com.sample.SpringDemo1.controller;

import com.sample.SpringDemo1.dto.DeptDto;
import com.sample.SpringDemo1.entity.Dept;
import com.sample.SpringDemo1.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.HttpStatus.CREATED;

@Controller
@RequestMapping("/dbc")
public class DeptController {

    @Autowired
    DeptService deptService;

    @PostMapping("/mns")
    public ResponseEntity<Dept>addDept(@RequestBody DeptDto deptDto){
        return new  ResponseEntity<>(deptService.addDept(deptDto),CREATED);
    }
}
