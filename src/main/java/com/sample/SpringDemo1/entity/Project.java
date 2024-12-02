package com.sample.SpringDemo1.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pid;

    private String pName;

    private long mgrId;
    private long grp;

}
