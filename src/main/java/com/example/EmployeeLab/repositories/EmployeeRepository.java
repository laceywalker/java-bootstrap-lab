package com.example.EmployeeLab.repositories;

import com.example.EmployeeLab.controllers.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
