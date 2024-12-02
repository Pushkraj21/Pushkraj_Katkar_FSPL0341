package com.sample.SpringDemo1.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="manager")
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long mgrId;

    private long projectId;
}
