package com.sample.SpringDemo1.repository;

import com.sample.SpringDemo1.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {
}
