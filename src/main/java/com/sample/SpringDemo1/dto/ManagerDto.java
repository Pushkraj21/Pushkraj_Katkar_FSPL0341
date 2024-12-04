package com.sample.SpringDemo1.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ManagerDto {
    private long projectId;

    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;
}
