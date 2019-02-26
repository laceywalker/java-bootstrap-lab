package com.example.EmployeeLab.models;

import java.util.ArrayList;

public class Department {

    private String departmentName;
    private ArrayList<Employee> employeesInDepartment;

    public Department(String departmentName){
        this.departmentName = departmentName;
        this.employeesInDepartment = new ArrayList<>();
    }

    public Department(){

    }

    public String getDepartmentName() {
        return departmentName;
    }

    public ArrayList<Employee> getEmployeesInDepartment() {
        return employeesInDepartment;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setEmployeesInDepartment(ArrayList<Employee> employeesInDepartment) {
        this.employeesInDepartment = employeesInDepartment;
    }
}


