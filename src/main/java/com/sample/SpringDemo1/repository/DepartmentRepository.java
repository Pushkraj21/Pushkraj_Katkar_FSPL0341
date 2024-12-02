package com.sample.SpringDemo1.repository;

import com.sample.SpringDemo1.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Dept,Long> {
}
