package com.sample.SpringDemo1.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="Dept")
public class Dept {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long deptNo;

    private String dName;
    private String location;

}
