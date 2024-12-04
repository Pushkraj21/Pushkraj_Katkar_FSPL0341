package com.sample.SpringDemo1.service;

import com.sample.SpringDemo1.dto.DeptDto;
import com.sample.SpringDemo1.entity.Dept;
import com.sample.SpringDemo1.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptService {

    @Autowired
    DepartmentRepository departmentRepository;

    public  Dept addDept(DeptDto deptDto) {
        Dept dept=new Dept();

        dept.setDeptNo(0L);
        dept.setDName(deptDto.getDName());
        dept.setLocation(deptDto.getLocation());
        dept.setActive(true);
        dept.setCreatedBy(deptDto.getCreatedBy());
        dept.setUpdatedBy(deptDto.getUpdatedBy());
        dept.setUpdatedDate(deptDto.getUpdatedDate());

        return departmentRepository.save(dept);

    }
}
