package com.sample.SpringDemo1.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name="EmpInfo")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long eid;

    private String eFirstname;
    private String eLastname;
    private String email;
    private String job;
    private double salary;
    private int deptNo;
    private String dateOfJoining;
    private long mgrId;
    private String mgrName;
    private double comm;

    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;


}
