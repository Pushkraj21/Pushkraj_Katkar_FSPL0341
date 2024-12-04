package com.sample.SpringDemo1.controller;

import com.sample.SpringDemo1.dto.ManagerDto;
import com.sample.SpringDemo1.entity.Manager;
import com.sample.SpringDemo1.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.HttpStatus.CREATED;

@Controller
@RequestMapping("/abc")
public class ManagerController {

    @Autowired
    ManagerService managerService;

    @PostMapping("/xyz")
    public ResponseEntity<Manager>addData(@RequestBody ManagerDto managerDto){
        return new ResponseEntity<>(managerService.addData(managerDto),CREATED);

    }
}
