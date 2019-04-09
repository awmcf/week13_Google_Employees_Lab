package com.codeclan.googleEmployees.googleEmployees.models;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private Long id;
    private String name;
    private int days;
    private List<Employee> employees;

    public Project(String name, int days) {
        this.name = name;
        this.days = days;
        this.employees = new ArrayList<>();
    }

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
