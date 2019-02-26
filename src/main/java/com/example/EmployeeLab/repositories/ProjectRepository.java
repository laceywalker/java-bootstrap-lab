package com.example.EmployeeLab.repositories;

import com.example.EmployeeLab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
