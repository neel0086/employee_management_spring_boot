package com.example.spring_backend.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="employees")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fname;
    private String lname;
    private String emailId;
}
