package com.example.EmployeeLab.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    String name;

    @Column(name = "age")
    int age;

    @Column(name = "employeeNumber")
    int employeeNumber;

    @Column(name = "email")
    String email;

    public Employee(String name, int age, int employeeNumber, String email) {
        this.name = name;
        this.age = age;
        this.employeeNumber = employeeNumber;
        this.email = email;
    }

    public Employee(){

    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
