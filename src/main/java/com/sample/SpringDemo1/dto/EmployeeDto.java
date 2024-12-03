package com.sample.SpringDemo1.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EmployeeDto {
    private String eFirstname;
    private String eLastname;
    private String email;
   // private String job;
  //  private double salary;
   // private int deptNo;
   // private String dateOfJoining;
   // private long mgrId;
   // private String mgrName;
   // private double comm;

    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;
}
