package com.sample.SpringDemo1.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DeptDto {
    private String dName;
    private String location;

    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;
}
