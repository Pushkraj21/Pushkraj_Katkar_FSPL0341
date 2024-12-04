package com.sample.SpringDemo1.controller;

import com.sample.SpringDemo1.dto.ProjectDto;
import com.sample.SpringDemo1.entity.Project;
import com.sample.SpringDemo1.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.HttpStatus.CREATED;

@Controller
@RequestMapping("/acc")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @PostMapping("/aaa")
    public ResponseEntity<Project>addData(@RequestBody ProjectDto projectDto){
        return new  ResponseEntity<>(projectService.addData(projectDto),CREATED);
    }
}
