package com.labassignment.employeeCRUD.models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "employees")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String jobRole;
    private double salary;

    @Column(columnDefinition = "TEXT")
    private String description;
    private Date createdAt;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getJobRole() {
        return jobRole;
    }
    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated_at() {
        return createdAt;
    }
    public void setCreated_at(Date createdAt) {
        this.createdAt = createdAt;
    }

}
