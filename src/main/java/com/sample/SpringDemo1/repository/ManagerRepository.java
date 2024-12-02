package com.sample.SpringDemo1.repository;

import com.sample.SpringDemo1.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager,Long> {
}
