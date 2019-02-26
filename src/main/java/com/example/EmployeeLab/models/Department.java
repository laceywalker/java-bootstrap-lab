package com.example.EmployeeLab.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "department")

public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "department_name")
    private String departmentName;


    @OneToMany(mappedBy = "department")
    private List<Employee> employeesInDepartment;



    public Department(String departmentName){
        this.departmentName = departmentName;
        this.employeesInDepartment = new ArrayList<>();
    }

    public Department(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public List<Employee> getEmployeesInDepartment() {
        return employeesInDepartment;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setEmployeesInDepartment(ArrayList<Employee> employeesInDepartment) {
        this.employeesInDepartment = employeesInDepartment;
    }

    public void addToEmployeesList(Employee employee){
        this.employeesInDepartment.add(employee);
    }

    public int employeeListCount(){
        return this.employeesInDepartment.size();
    }
}


