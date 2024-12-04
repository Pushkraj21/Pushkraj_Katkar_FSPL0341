package com.sample.SpringDemo1.service;

import com.sample.SpringDemo1.dto.ManagerDto;
import com.sample.SpringDemo1.entity.Manager;
import com.sample.SpringDemo1.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ManagerService {
    @Autowired
    ManagerRepository managerRepository;

    public Manager addData(ManagerDto managerDto) {
        Manager manager=new Manager();

        manager.setMgrId(0L);
        manager.setProjectId(manager.getProjectId());
        manager.setActive(true);
        manager.setCreatedBy(managerDto.getCreatedBy());
        manager.setUpdatedBy(managerDto.getUpdatedBy());
        manager.setUpdatedDate(LocalDateTime.now());

        return managerRepository.save(manager);

    }
}
