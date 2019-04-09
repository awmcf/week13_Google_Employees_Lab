package com.codeclan.googleEmployees.googleEmployees.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int days;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "employees_projects",
            joinColumns = { @JoinColumn(
                    name = "project_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = {@JoinColumn(
                    name = "employee_id",
                    nullable = false,
                    updatable = false)
            })
    private List<Employee> employees;

    public Project(String name, int days) {
        this.name = name;
        this.days = days;
        this.employees = new ArrayList<>();
    }

    public Project() {}


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getDays() {
        return this.days;
    }

    public void setDays(int newDays) {
        this.days = newDays;
    }

    public List<Employee> getEmployee() {
       return employees;
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }
}
