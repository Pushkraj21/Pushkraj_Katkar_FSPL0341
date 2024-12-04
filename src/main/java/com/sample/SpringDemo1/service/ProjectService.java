package com.sample.SpringDemo1.service;

import com.sample.SpringDemo1.dto.ProjectDto;
import com.sample.SpringDemo1.entity.Project;
import com.sample.SpringDemo1.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    public Project addData(ProjectDto projectDto) {
        Project project=new Project();
        project.setPid(0L);
        project.setPName(projectDto.getPName());
        project.setMgrId(projectDto.getMgrId());
        project.setGrp(projectDto.getGrp());

        project.setActive(true);
        project.setCreatedBy(projectDto.getCreatedBy());
        project.setUpdatedBy(projectDto.getUpdatedBy());
        project.setUpdatedDate(LocalDateTime.now());

        return projectRepository.save(project);

    }
}
