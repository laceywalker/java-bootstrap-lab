package com.example.EmployeeLab.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "projects")


public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "duration")
    private int duration;

    @JsonIgnore
    @ManyToMany
    @Cascade(value = {CascadeType.ALL})
    @JoinTable(
            name = "employees_projects",
            joinColumns = {@JoinColumn(
                    name = "project_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = {@JoinColumn(
                    name = "employee_id",
                    nullable = false,
                    updatable = false
            )})
    private List<Employee> employeesOnProject;




    public Project(String projectName, int duration){
        this.projectName = projectName;
        this.duration = duration;
        this.employeesOnProject = new ArrayList<>();
    }

    public Project(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Employee> getEmployeesOnProject() {
        return employeesOnProject;
    }

    public void setEmployeesOnProject(List<Employee> employeesOnProject) {
        this.employeesOnProject = employeesOnProject;
    }

    public void addToEmployeesToProject(Employee employee){
        this.employeesOnProject.add(employee);
    }

    public int employeesProjectCount(){
        return this.employeesOnProject.size();
    }


}
